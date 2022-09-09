package com.spring.UstaadG.Service;


import com.spring.UstaadG.Entity.Admin;
import com.spring.UstaadG.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@Component

public class AdminService {
    //private Admin admin;
    @Autowired
    private AdminRepository adminRepository;

    ////for getting Admins
    public List<Admin> getAdmins() {

        return adminRepository.findAll();
    }

    //to Add admin
    public Admin addAdmin(Admin admin) {

        return adminRepository.save(admin);
    }

    //For getting by id (Admin)
    public Admin getById(Admin admin) {
        return adminRepository.save(admin);
    }
    //for update
        public Admin updateAdmin(Admin userDto,Long id) {

            adminRepository.findById(id).isPresent();
                userDto.setId(id);
                adminRepository.save(userDto);
                return userDto;

        }


    }








