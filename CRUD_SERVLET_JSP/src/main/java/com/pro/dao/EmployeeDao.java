/**
 * 
 */
package com.pro.dao;

import java.util.List;

import com.pro.pojo.Employee;

/**
 * @author Mujtaba khan
 *
 */
public interface EmployeeDao {
	public abstract void create(Employee e); // insert

	public abstract List<Employee> read();   // fetch

}
