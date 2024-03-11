package br.bom.agenda.API.agenda.domain.dto;

import br.bom.agenda.API.agenda.domain.model.Categoria;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CadastroDTO (

        @NotBlank
        String nome,

        @NotBlank
        String sobrenome,

        @Email
        String email,

        @NotBlank
        String celular,
        String celular_2,

        @NotNull
        Categoria categoria
){
}
