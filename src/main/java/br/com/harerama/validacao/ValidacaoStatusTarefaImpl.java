package br.com.harerama.validacao;

import br.com.harerama.modelo.StatusTarefa;
import br.com.harerama.modelo.Tarefa;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidacaoStatusTarefaImpl implements ConstraintValidator<ValidacaoStatusTarefa, Tarefa> {

    @Override
    public boolean isValid(Tarefa tarefa, ConstraintValidatorContext constraintValidatorContext) {
        return tarefa.temStatus() && tarefa.statusTarefaPosteriorAoStatus(StatusTarefa.INICIAL);
    }

}
