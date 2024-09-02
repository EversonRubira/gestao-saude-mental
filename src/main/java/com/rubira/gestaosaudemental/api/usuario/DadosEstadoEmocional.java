package com.rubira.gestaosaudemental.api.usuario;

import java.time.LocalDate;

/**
 * DadosEstadoEmocional encapsula o estado emocional de um usuário em uma data específica.
 */
public record DadosEstadoEmocional(LocalDate data, EstadoEmocional estado) {

    /**
     * Construtor adicional que realiza uma transformação ou inicialização diferente.
     */
    public DadosEstadoEmocional(LocalDate data, EstadoEmocional estado) {
        // Aqui, inicializamos diretamente os componentes do record
        this.data = data;
        this.estado = estado;
    }
}