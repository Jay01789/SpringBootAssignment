package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.dao.UMSRepository;
import com.example.UserManagementSystem.model.UMS;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class UMSService {
    @Autowired
    UMSRepository repository;

    public UMS addUser(UMS ums) {
        return repository.save(ums);
    }

    public List<UMS> getbyid(int id) {
        List<UMS> res;
        res = new ArrayList<>();
        res.add(repository.findById(id).get());
        return res;
    }

    public List<UMS> getall() {
        return (List<UMS>) repository.findAll();
    }


    public ResponseEntity<UMS> updatebyid(int id, UMS ums) {
        Optional<UMS> UMSdata = repository.findById(id);
        if (UMSdata.isPresent()) {
            UMS _ums = UMSdata.get();
            _ums.setUserid(ums.getUserid());
            _ums.setUsername(ums.getUsername());
            _ums.setDob(ums.getDob());
            _ums.setEmail(ums.getEmail());
            _ums.setNumber(ums.getNumber());
            _ums.setDate(ums.getDate());
            _ums.setTime(ums.getTime());

       return new ResponseEntity<>(repository.save(_ums),HttpStatus.OK);
        }
        return null;
    }

    public void deletebyid(int id) {
        repository.deleteById(id);
    }
}

