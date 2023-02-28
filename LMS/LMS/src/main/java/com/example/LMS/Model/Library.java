package com.example.LMS.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Library {
    private Integer id;
    private String name;
    private String address;
    private String facilities;

}
