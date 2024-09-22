package com.rubira.gestaosaudemental.api.domain.usuario;

import java.time.LocalDate;

/**
 * DadosAtividade encapsula as informações sobre uma atividade realizada pelo usuário,
 * incluindo a data da atividade e uma descrição da mesma.
 */
public record DadosAtividade(LocalDate data, String atividadeRealizada) {

    /**
     * Construtor que converte uma instância de Atividade em DadosAtividade.
     *
     * @param atividadeUsuario Objeto Atividade que contém os detalhes da atividade realizada.
     */
    public DadosAtividade(AtividadeUsuario atividadeUsuario) {
        this(atividadeUsuario.getData(), atividadeUsuario.getDescricao());
    }
}
