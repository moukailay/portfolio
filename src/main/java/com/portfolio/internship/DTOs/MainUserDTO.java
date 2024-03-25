package com.portfolio.internship.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MainUserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;



}
