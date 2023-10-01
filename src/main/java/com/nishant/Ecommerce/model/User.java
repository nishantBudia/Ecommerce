package com.nishant.Ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue()
    Integer id;

    @NotBlank
    String name;

    @Email
    String email;

    @Pattern(regexp = "^(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{5,20}$")
    String password;

    @Pattern(regexp = "^\\d{10}$\n")
    String phoneNumber;
}
