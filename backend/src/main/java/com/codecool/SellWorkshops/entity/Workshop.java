package com.codecool.SellWorkshops.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
