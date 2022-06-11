package com.WeakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws InterruptedException {
		WeakHashMap w = new WeakHashMap();
		Temp t = new Temp();
		w.put(t, "Durga");
		System.out.println(w);
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(w);
	}
}

class Temp {
	public String toString() {
		return "temp";
	}

	@Override
	public void finalize() {
		System.out.println("Finalize method is called");
	}
}
