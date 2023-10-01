package com.nishant.Ecommerce.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;

@Data
@Entity
@Validated
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue
    Integer id;

    @ManyToOne(targetEntity = User.class)
    @NotNull
    User user;

    @ManyToMany(targetEntity = Product.class)
    @NotNull
    ArrayList<Product> products;

    @ManyToMany(targetEntity = Address.class)
    @NotNull
    ArrayList<Address> address;

    @NotNull
    ArrayList<Integer> productQuantity;
}
