package com.rubira.gestaosaudemental.api.domain.usuario;

import java.time.LocalDate;

/**
 * DadosEstadoEmocional encapsula o estado emocional de um usuário em uma data específica.
 */

public record DadosEstadoEmocional(LocalDate data, EstadoEmocional estado, String descricaoAtividade) {


}
    

