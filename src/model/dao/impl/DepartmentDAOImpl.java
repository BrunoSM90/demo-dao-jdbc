package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
		try {
			PreparedStatement st = conn.prepareStatement("SELECT * from Department WHERE id = ?;");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("Id: " + rs.getInt(1) + "Name: " + rs.getString(2));
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Department> findAll() {
		
		return null;
	}

}
