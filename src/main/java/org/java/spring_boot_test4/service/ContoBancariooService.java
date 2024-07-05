package org.java.spring_boot_test4.service;

import java.util.List;

import org.java.spring_boot_test4.pojo.ContoBancario;
import org.java.spring_boot_test4.repo.ContoBancariooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContoBancariooService {

    @Autowired
    private ContoBancariooRepo contoBancariooRepo;

     public List<ContoBancario> getAllContoBancario() {
        return contoBancariooRepo.findAll();
    }
    public void saveContoBancario(ContoBancario c) {
        contoBancariooRepo.save(c);
        
    }
}
