package com.rubira.gestaosaudemental.api.controller;

import com.rubira.gestaosaudemental.api.usuario.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {
        if (dados.dataNascimento().isAfter(LocalDate.now().minusYears(18))){
            throw new IllegalArgumentException("O usuário deve ter pelo menos 18 anos.");
        }
        repository.save(new Usuario(dados));
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário cadastrado com sucesso!");
    }

    @GetMapping("/perfil/{id}")
    public ResponseEntity<DadosPerfilUsuario> getPerfilUsuario(@PathVariable Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return ResponseEntity.ok(new DadosPerfilUsuario(usuario));
    }

    @GetMapping("/historico-emocional/{id}")
    public ResponseEntity<List<DadosEstadoEmocional>> getHistoricoEmocional(@PathVariable Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // Obter o histórico emocional do usuário. Implementar a lógica aqui.
        List<DadosEstadoEmocional> historico = List.of(new DadosEstadoEmocional(LocalDate.now(), D));
        return ResponseEntity.ok(historico);
    }

    @GetMapping("/atividades/{id}")
    public ResponseEntity<List<DadosAtividade>> getAtividadesRealizadas(@PathVariable Long id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // Obter a lista de atividades realizadas pelo usuário. Implementar a lógica aqui.
        List<DadosAtividade> atividades = List.of(new DadosAtividade(LocalDate.now(), usuario.getAtividadeRealizada()));
        return ResponseEntity.ok(atividades);
    }

    @PutMapping
    @Transactional
    public ResponseEntity<DadosDetalhamentoUsuario> atualizar(@RequestBody @Valid DadosAtualizacaoUsuario dados) {
        Usuario usuario = repository.getReferenceById(dados.id());
        usuario.atualizarinformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        Usuario usuario = repository.getReferenceById(id);
        usuario.excluir();
        return ResponseEntity.noContent().build();
    }
}
