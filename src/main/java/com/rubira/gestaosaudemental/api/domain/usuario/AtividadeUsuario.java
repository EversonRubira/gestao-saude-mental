package com.rubira.gestaosaudemental.api.domain.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import java.time.LocalDate;

@Entity
public class AtividadeUsuario {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String descricao;

    @Getter
    private LocalDate data;

    @Getter
    @Enumerated(EnumType.STRING)
    private EstadoEmocional estadoEmocional;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Construtor padrão
    public AtividadeUsuario() {}

    // Construtor completo
    public AtividadeUsuario(String descricao, LocalDate data, EstadoEmocional estadoEmocional, Usuario usuario) {
        this.descricao = descricao;
        this.data = data;
        this.estadoEmocional = estadoEmocional;
        this.usuario = usuario;
    }
}
