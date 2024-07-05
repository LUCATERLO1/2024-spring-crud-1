package org.java.spring_boot_test4;

import org.java.spring_boot_test4.pojo.ContoBancario;
import org.java.spring_boot_test4.service.ContoBancariooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest4Application implements CommandLineRunner{

	@Autowired
	private ContoBancariooService contoBancariooService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ContoBancario c = new ContoBancario();
		System.out.println(c);

		c.deposita(100);
            System.out.println(c);

            c.preleva(50);
            System.out.println(c);
           

		System.out.println("-------------------------------------------------------------------------");

		contoBancariooService.saveContoBancario(c);
		
		contoBancariooService.getAllContoBancario().forEach(System.out::println);
	}

}
