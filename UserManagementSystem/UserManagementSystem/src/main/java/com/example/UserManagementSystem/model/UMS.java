package com.example.UserManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@ConditionalOnClass
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USER_DATA")
public class UMS {
    @Id
    @Column(name = "user_Id")
    private int userid;
    private String username;
    private String dob;
    private String email;
    private Long number;
    private String date;
    private String time;

}
