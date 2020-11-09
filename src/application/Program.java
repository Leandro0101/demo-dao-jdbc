package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao dellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = dellerDao.findById(1);
		System.out.println(seller);
	}

}
