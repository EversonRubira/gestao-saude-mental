package com.rubira.gestaosaudemental.api.usuario;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record DadosCadastroUsuario(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "Email inválido")
        String email,

        @NotNull @PastOrPresent
        LocalDate dataNascimento,

        @NotNull
        EstadoEmocional estadoEmocional,

        @NotBlank
        String atividadeRealizada,

        String observacoesGerais

) {
}
