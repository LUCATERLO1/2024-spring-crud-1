package org.java.spring_boot_test4.repo;

import org.java.spring_boot_test4.pojo.ContoBancario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContoBancariooRepo extends JpaRepository<ContoBancario, Integer>{

}
