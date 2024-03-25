package com.portfolio.internship.DTOs;

import com.portfolio.internship.models.MainUser;
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

    public static MainUserDTO fromMainUser(MainUser mainUser) {
        return new MainUserDTO(
                mainUser.getId(),
                mainUser.getUsername(),
                mainUser.getPassword(),
                mainUser.getEmail(),
                mainUser.getRole(),
                mainUser.getFirstName(),
                mainUser.getLastName(),
                mainUser.getPhoneNumber(),
                mainUser.getAddress()
                );
    }

    public static MainUser toMainUser(MainUserDTO mainUserDTO) {
        return new MainUser(
                mainUserDTO.getId(),
                mainUserDTO.getUsername(),
                mainUserDTO.getPassword(),
                mainUserDTO.getEmail(),
                mainUserDTO.getRole(),
                mainUserDTO.getFirstName(),
                mainUserDTO.getLastName(),
                mainUserDTO.getPhoneNumber(),
                mainUserDTO.getAddress()
        );
    }
}
