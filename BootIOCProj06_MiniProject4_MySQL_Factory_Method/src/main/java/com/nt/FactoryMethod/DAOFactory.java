package com.nt.FactoryMethod;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.DAO.Employee;
import com.nt.DAO.EmployeeImpl;
import com.nt.DAO.EmployeeImpl2;
import com.nt.DAO.IEmployeeDAO;

@Component
public class DAOFactory implements FactoryBean<IEmployeeDAO> {
	
	@Value("${per.did}")
	private String daoId;
	
	@Autowired
	private DataSource ds;

	@Override
	public IEmployeeDAO getObject() throws Exception {
		if(daoId.equalsIgnoreCase("empMySql")) {
			return new EmployeeImpl2(ds);
		}else if(daoId.equalsIgnoreCase("empOracle")) {
			return new EmployeeImpl(ds);
		}else {
		 throw new IllegalArgumentException("Invalid DAO");
		}
	}

	@Override
	public Class<?> getObjectType() {
	
		return IEmployeeDAO.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}

}
