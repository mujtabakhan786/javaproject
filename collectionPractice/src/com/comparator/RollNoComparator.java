package com.comparator;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.rollno == o2.rollno)
			return 0;
		else if (o1.rollno > o2.rollno)
			return 1;
		else
			return -1;
	}

}
