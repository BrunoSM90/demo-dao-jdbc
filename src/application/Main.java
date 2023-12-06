package application;

import db.DB;
import model.dao.IDepartmentDAO;
import model.dao.impl.DepartmentDAOImpl;

public class Main {

	public static void main(String[] args) {
//		Department obj = new Department(1, "Books");
//		System.out.println(obj);
//		
//		Seller seller = new Seller(21, "Bob,", "bob@gmail.com", new Date(), 3000.00);
//		System.out.println(seller);
		IDepartmentDAO depDAO = new DepartmentDAOImpl(DB.getConnection());
		depDAO.findById(1);
	}

}
