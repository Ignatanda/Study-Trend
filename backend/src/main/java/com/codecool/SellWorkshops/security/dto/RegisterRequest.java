package com.codecool.SellWorkshops.security.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 20, message = "Username must be minimum 3 and maximum 20 characters")
    public String username;
    @Email(message = "Email not valid")
    public String email;
    @Size(min = 8, max = 30, message = "Password must be minimum 8 characters")
    public String password;
}
