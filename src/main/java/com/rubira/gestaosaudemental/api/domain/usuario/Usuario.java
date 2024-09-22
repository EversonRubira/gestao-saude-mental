package com.rubira.gestaosaudemental.api.domain.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "usuarios")
@Entity(name = "Usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="id")

public class Usuario {

    //public Object excluir;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataNascimento;
    private String atividadeRealizada;
    private String observacoesGerais;


    @Enumerated(EnumType.STRING)
    private EstadoEmocional estadoEmocional;

    private Boolean ativo;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<HistoricoEmocional> historicoEmocional = new ArrayList<>();



    public Usuario(DadosCadastroUsuario dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.dataNascimento = dados.dataNascimento();
        this.atividadeRealizada = dados.atividadeRealizada();
        this.observacoesGerais = dados.observacoesGerais();
        this.estadoEmocional = dados.estadoEmocional();
    }

    public void atualizarinformacoes(DadosAtualizacaoUsuario dados) {
        if(dados.email() !=null) {
            this.email = dados.email();
        }
        if(dados.atividadeRealizada() !=null) {
            this.atividadeRealizada = dados.atividadeRealizada();
        }

        if(dados.observacoesGerais() !=null) {
            this.observacoesGerais = dados.observacoesGerais();
        }
    }

    public void excluir() {
        this.ativo = false;
    }

    public List<HistoricoEmocional> getHistoricoEmocional() {
        return this.historicoEmocional;
    }

}
