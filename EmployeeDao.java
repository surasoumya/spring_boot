package com.mondee;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class EmployeeDao  extends JdbcDaoSupport{

	@Autowired //dependencies injection is perfomed on it, object is created
	DataSource dataSource;
	
	@PostConstruct
	private  void initialize() { //	 this method will excute after the dependencies injection
   setDataSource(dataSource); //predefined method
	}
	public void insert(Employee emp) {
		
	String sql="insert into employee values("+emp.getEid()+",'"+emp.getEname()+"',"+emp.getEsalary()+")";
		getJdbcTemplate().execute(sql);
		
	}
	}
