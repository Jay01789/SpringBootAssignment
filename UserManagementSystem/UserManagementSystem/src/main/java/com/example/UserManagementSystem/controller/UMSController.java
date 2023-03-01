package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.UMS;
import com.example.UserManagementSystem.service.UMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UMSController {
    @Autowired
    UMSService service;

    @PostMapping(value = "/add-user")
    public UMS adduser(@RequestBody UMS ums){
        return  service.addUser(ums);
    }

    @GetMapping(value = "/getbyid")
    public List<UMS> getbyid(@RequestParam int id){
        return service.getbyid(id);
    }

   @GetMapping("/getall")
    public List<UMS> getall(){
       List<UMS> getall = service.getall();
       return getall;
   }

   @PutMapping("/update")
    public void updateuser(@RequestParam int id , @RequestBody UMS ums){
                service.updatebyid(id,ums);
   }

   @DeleteMapping("/delete")
    public void deletebyid(@RequestParam int id){
        service.deletebyid(id);
   }

}
