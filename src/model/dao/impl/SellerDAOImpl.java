package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ISellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class SellerDAOImpl implements ISellerDAO {
	Connection conn;
		
	public SellerDAOImpl() {
		
	}
	
	public SellerDAOImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Seller Seller) {
		// TODO Auto-generated method stub
		
	}

	@Override	
	public void update(Seller Seller) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			Seller seller = null;
			
			final String query = "SELECT Seller.*, Department.Name AS 'Nome_Departamento'\r\n"
					+ "FROM Seller\r\n"
					+ "INNER JOIN Department\r\n"
					+ "ON Seller.DepartmentId = Department.Id\r\n"
					+ "WHERE SELLER.Id = ?;";
			
			st = conn.prepareStatement(query);
			st.setInt(1, id);
			
			rs = st.executeQuery();
			if (rs.next()) {
				//criar um método privado que recebe o ResultSet e instancia os objetos
				Integer sellerId = rs.getInt(1);
				String  name = rs.getString(2);
				String email = rs.getString(3);
				Date birthDate = rs.getDate(4);
				Double baseSalary = rs.getDouble(5);
				
				Integer departmentId = rs.getInt(6);
				String departmentName = rs.getString(7);
				Department department = new Department(departmentId, departmentName);

				seller = new Seller(sellerId, name, email, birthDate, baseSalary, 
						department);
			}
			
			return seller;
		} 
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		} 
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
