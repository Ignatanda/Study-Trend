package com.codecool.SellWorkshops.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Workshop {
    @Id
    @GeneratedValue
    private long id;
    @NotNull(message = "Name cannot be null")
    private String name;
    @Size(min = 10, max = 200, message = "Description must be between 10 and 200 characters")
    private String description;

}