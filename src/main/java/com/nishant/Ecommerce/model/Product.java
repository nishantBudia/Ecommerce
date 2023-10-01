package com.nishant.Ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Entity
public class Product {
    @Id
    @GeneratedValue()
    Integer id;

    @NotBlank
    String name;

    @NotNull
    Integer price;

    @Size(min = 50)
    String description;

    Category category;

    Brand brand;

}
