package com.rubira.gestaosaudemental.api.usuario;


public record DadosPerfilUsuario(Long id, String nome, String email, String observacoesGerais  ) {

    public DadosPerfilUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getObservacoesGerais());
    }
}
