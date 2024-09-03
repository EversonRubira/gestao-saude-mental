package com.rubira.gestaosaudemental.api.usuario;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class AtividadeUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtor padrão
    public AtividadeUsuario() {}

    public AtividadeUsuario(String descricao, LocalDate data, Usuario usuario) {
        this.descricao = descricao;
        this.data = data;
        this.usuario = usuario;
    }

    // Getters
    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }
}
