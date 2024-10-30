package br.com.harerama.servico;

import br.com.harerama.modelo.Tarefa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class ServicoTarefa {

    private Logger logger = LoggerFactory.getLogger(ServicoTarefa.class);

    public Tarefa salvar(Tarefa tarefa) {
        Long id = ThreadLocalRandom.current().nextLong(0, 100);
        tarefa.setId(id);
        tarefa.statusInicial();
        logger.info("incluindo {}", tarefa);
        return tarefa;
    }

    public Tarefa atualizar(Long id, Tarefa tarefa) {
        tarefa.setId(id);
        logger.info("atualizando {}", tarefa);
        return tarefa;
    }

}
