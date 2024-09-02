package com.rubira.gestaosaudemental.api.usuario;

import java.time.LocalDate;

public record DadosDetalhamentoUsuario(
        Long id,
        String nome,
        String email,
        EstadoEmocional estadoemocional,
        String atividadeRealizada,
        String observacoesGerais) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getEstadoEmocional(),
                usuario.getAtividadeRealizada(), usuario.getObservacoesGerais());
    }

}


