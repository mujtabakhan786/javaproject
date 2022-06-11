/**
 * 
 */
package com.jsoft.dao;

import java.util.List;

import com.jsoft.pojo.Person;

/**
 * @author Mujtaba khan
 *
 */
public interface PersonDao {
	public void create(Person p);
	public List<Person> read();
}
