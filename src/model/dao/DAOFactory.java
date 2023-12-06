package model.dao;

import db.DB;
import model.dao.impl.DepartmentDAOImpl;
import model.dao.impl.SellerDAOImpl;

public class DAOFactory {
	
	public static IDepartmentDAO createDepartmentDAO() {
		return new DepartmentDAOImpl(DB.getConnection());
	}
	
	public static ISellerDAO createSellerDAO() {
		return new SellerDAOImpl(DB.getConnection());
	}
}
