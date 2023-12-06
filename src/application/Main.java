package application;

import model.dao.DAOFactory;
import model.dao.IDepartmentDAO;

public class Main {

	public static void main(String[] args) {
//		Department obj = new Department(1, "Books");
//		System.out.println(obj);
//		
//		Seller seller = new Seller(21, "Bob,", "bob@gmail.com", new Date(), 3000.00);
//		System.out.println(seller);
		IDepartmentDAO depDAO = DAOFactory.createDepartmentDAO();
		depDAO.findById(1);
	}

}
