package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDeparmentDao();
		Department department = new Department(null, "Enfermagem");
		
		System.out.println("\n=== TEST 1: Department insert====");
		departmentDao.insert(department);
		System.out.println("Inserted! Id = "+department.getId());
		
		System.out.println("\n=== TEST 2: Department findById====");
		System.out.println(departmentDao.findById(90));
	}
}
