package com.xworkz.cutomerjdbctemplate.tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xworkz.cutomerjdbctemplate.dao.CustomerDAOImpl;
import com.xworkz.cutomerjdbctemplate.dto.CustomerDTO;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerDTO dto1 = new CustomerDTO(1, "megha", 9900125889l, "megha@gmail.com");
		CustomerDTO dto2 = new CustomerDTO(2, "manju", 9900125569l, "manju@gmail.com");
		CustomerDTO dto3 = new CustomerDTO(3, "chetu", 9456125569l, "chetu@gmail.com");
		CustomerDTO dto4 = new CustomerDTO(4, "chandana", 9457655569l, "chandana@gmail.com");
		CustomerDTO dto5 = new CustomerDTO(5, "pinkuu", 9275655569l, "pinku@gmail.com");
		CustomerDTO dto6 = new CustomerDTO(6, "purnu", 9275655643l, "purnu@gmail.com");
		CustomerDTO dto7 = new CustomerDTO(7, "sharu", 92903655643l, "sharu@gmail.com");

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring.xml")) {
			CustomerDAOImpl dao = (CustomerDAOImpl) context.getBean("customerDao");
			// int save=dao.saveCustomer(dto1);
			// System.out.println(save);
			System.out.println("Inserting data:" + dao.saveCustomer(dto1) + dao.saveCustomer(dto2)
					+ dao.saveCustomer(dto3) + dao.saveCustomer(dto4) + dao.saveCustomer(dto5) + dao.saveCustomer(dto5)
					+ dao.saveCustomer(dto6) + dao.saveCustomer(dto7));

			int update = dao.updateCustomer(dto3);
			System.out.println("Updating data:" + update);

			dto7.setId(7);
			int delete = dao.deleteCustomer(dto7);
			System.out.println("Deleting data:" + delete);
		}

	}

}
