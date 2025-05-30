package com.example.relations.DTO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record HobbyDTO(
        @NotNull
        @Size(min=1, max =50)
        String type
                       ) {
}
