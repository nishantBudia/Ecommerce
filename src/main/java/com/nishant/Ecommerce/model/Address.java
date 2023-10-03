package com.nishant.Ecommerce.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Data
@Validated
@Entity
public class Address {
    @Id
    @GeneratedValue()
    Integer id;

    @NotBlank
    String name;

    String landmark;

    @Pattern(regexp = "^\\d{10}")
    String phoneNumber;

    @Pattern(regexp = "^\\d{6}")
    String zipcode;

    @Enumerated(value = EnumType.STRING)
    State state;

    @ManyToMany(targetEntity = User.class)
    @NotNull
    List<User> user;

}
