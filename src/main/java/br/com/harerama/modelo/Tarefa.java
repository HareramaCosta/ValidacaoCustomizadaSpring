package br.com.harerama.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static java.util.Objects.nonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Tarefa {

    private Long id;
    private String titulo;
    private StatusTarefa statusTarefa;

    public boolean temStatus() {
        return nonNull(statusTarefa);
    }

    public boolean statusTarefaPosteriorAoStatus(StatusTarefa statusTarefa) {
        return this.statusTarefa.getId() > statusTarefa.getId();
    }

    public void statusInicial() {
        statusTarefa = StatusTarefa.INICIAL;
    }

}
