package br.com.harerama.validacao;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidacaoStatusTarefaImpl.class)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidacaoStatusTarefa {

    String message() default "O Status da tarefa deve ser superior ao inicial";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
