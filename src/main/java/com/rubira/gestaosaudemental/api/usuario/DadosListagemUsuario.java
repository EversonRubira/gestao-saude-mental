package com.rubira.gestaosaudemental.api.usuario;


public record DadosListagemUsuario(Long id, String nome, String email, EstadoEmocional estadoemocional, String atividadeRealizada, String observacoesGerais  ) {

    public DadosListagemUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getEstadoEmocional(), usuario.getAtividadeRealizada(), usuario.getObservacoesGerais());
    }
}
