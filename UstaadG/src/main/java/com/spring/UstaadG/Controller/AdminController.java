package com.spring.UstaadG.Controller;

import com.spring.UstaadG.Entity.Admin;

import com.spring.UstaadG.Repository.AdminRepository;
import com.spring.UstaadG.Service.AdminService;
import lombok.RequiredArgsConstructor;
import org.aspectj.apache.bcel.util.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AdminController {
    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("/Admins")
    public List<Admin> getAdmins() {

        return adminService.getAdmins();
    }
  /* @GetMapping("/Admins/{id}")
   public Admin getAdmin(@PathVariable("id") Long id) {
        Admin admin = null;
        adminService.getAdminById(id);
        return admin;

    }*/

    @PostMapping("/Admins")
    public Admin addAdmin(@RequestBody Admin admins) {


        Admin admin = this.adminService.addAdmin(admins);
        return admin;

    }



    //by ID
    @GetMapping("/Admins/{aid}")
    public Admin getById(@PathVariable("aid") Admin admins) {
        adminService.getById(admins);
        return admins;

    }
//for update
    @PostMapping("/Admins/{aId}")
    /*public ResponseEntity<Admin> updateAdmin(@PathVariable("adminId") Long adminId, @RequestBody Admin admin) {

    }*/
    public Admin updateAdmin(@RequestBody Admin admin,@PathVariable("aId") Long aId) {
         return adminService.updateAdmin(admin,aId);

    }


        //Delete Admin
        @DeleteMapping("/Admins/{aId}")
        public String deleteAdmin (@PathVariable("aId") Long adminId)
        {
            Admin a = adminRepository.getOne(adminId);
            adminRepository.delete(a);
            return "deleted";
            //Admin admin =adminService.getAdminById(adminId);
            //  this.adminService.deleteAdmin(bookId);
            //adminService.deleteAdmin(adminId);
            //return admin;
        }

}

