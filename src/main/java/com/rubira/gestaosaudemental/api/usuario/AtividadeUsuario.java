package com.rubira.gestaosaudemental.api.usuario;

import java.time.LocalDate;

public class AtividadeUsuario {

    private LocalDate data;
    private String descricao;

    // Corrigido o nome do construtor para corresponder ao nome da classe
    public AtividadeUsuario(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}
