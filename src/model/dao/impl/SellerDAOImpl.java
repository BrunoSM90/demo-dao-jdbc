package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.ISellerDAO;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
