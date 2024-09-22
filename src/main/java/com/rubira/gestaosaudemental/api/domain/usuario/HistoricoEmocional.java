package com.rubira.gestaosaudemental.api.domain.usuario;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class HistoricoEmocional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private LocalDate data;

    @Setter
    @Enumerated(EnumType.STRING)
    private EstadoEmocional estadoEmocional;

    @Setter
    private String descricaoAtividade;

    @Setter
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtor padrão
    public HistoricoEmocional() {}

    // Construtor completo com associação à AtividadeUsuario
    public HistoricoEmocional(LocalDate data, EstadoEmocional estadoEmocional, String descricaoAtividade, Usuario usuario) {
        this.data = data;
        this.estadoEmocional = estadoEmocional;
        this.descricaoAtividade = descricaoAtividade;
        this.usuario = usuario;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public EstadoEmocional getEstadoEmocional() {
        return estadoEmocional;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}

