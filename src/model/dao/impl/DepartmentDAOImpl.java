package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.IDepartmentDAO;
import model.entities.Department;

public class DepartmentDAOImpl implements IDepartmentDAO {
	Connection conn;
	
	public DepartmentDAOImpl() {
		
	}
	
	public DepartmentDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department department) {
		
		
	}

	@Override
	public void update(Department department) {
		
		
	}

	@Override
	public void deleteById(Integer id) {
		
	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Department department = null;
			final String query = "SELECT * from Department WHERE id = ?;";
			
			st = conn.prepareStatement(query);
			st.setInt(1, id);
			
			rs = st.executeQuery();
			if (rs.next()) {
				Integer idDepartment = rs.getInt(1);
				String name = rs.getString(2);
				
				department = new Department(idDepartment, name);
			}
			
			return department;
		} 
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Department> findAll() {
		
		return null;
	}

}
