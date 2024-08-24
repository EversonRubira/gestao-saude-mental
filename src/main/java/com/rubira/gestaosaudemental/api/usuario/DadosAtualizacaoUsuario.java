package com.rubira.gestaosaudemental.api.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(

        @NotNull
        Long id,
        String atividadeRealizada,
        @NotBlank
        String email,
        String observacoesGerais) {
}


