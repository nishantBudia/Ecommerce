package com.nishant.Ecommerce.model;

import com.nishant.Ecommerce.utils.SameLength;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Validated
@Table(name = "Orders")
@SameLength(fields = {"products","productQuantity"})
public class Order {
    @Id
    @GeneratedValue
    Integer id;

    @ManyToOne(targetEntity = User.class)
    @NotNull
    User user;

    @ManyToMany(targetEntity = Product.class)
    @NotNull
    List<Product> products;

    @ManyToOne(targetEntity = Address.class)
    @NotNull
    Address address;

    @NotNull
    List<Integer> productQuantity;
}
