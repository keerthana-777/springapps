package com.springapps.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps.springjdbc.employee.dao.EmployeeDao;
import com.springapps.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.springapps.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbctemplate;
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	
	
	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbctemplate.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return result;
	}

	
	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=? ";
		int result = jdbctemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getId());
		return result;
	}
	
	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		int result = jdbctemplate.update(sql, employee.getId());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee= jdbctemplate.queryForObject(sql, rowMapper, id);
		
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> employee= jdbctemplate.query(sql, rowMapper);
		return employee;

	}

}
