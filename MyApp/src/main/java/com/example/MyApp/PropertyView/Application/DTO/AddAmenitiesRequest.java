package com.example.MyApp.PropertyView.Application.DTO;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class AddAmenitiesRequest {
    @NotNull
    private List<@NotBlank String> amenities;
}
