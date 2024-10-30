package br.com.harerama.recursos;

import br.com.harerama.modelo.Tarefa;
import br.com.harerama.servico.ServicoTarefa;
import br.com.harerama.validacao.ValidacaoStatusTarefa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping(value = "/tarefas")
public class RecursoTarefa {

    @Autowired
    private ServicoTarefa servicoTarefa;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Tarefa> criar(@NotNull @Valid @RequestBody Tarefa tarefa) {
        return ResponseEntity.ofNullable(servicoTarefa.salvar(tarefa));
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity atualizar(@PathVariable(value = "id") Long id, @NotNull @Valid @ValidacaoStatusTarefa @RequestBody Tarefa tarefa) {
        return ResponseEntity.ofNullable(servicoTarefa.atualizar(id, tarefa));
    }

}
