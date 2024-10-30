package br.com.harerama.modelo;

import lombok.Getter;

public enum StatusTarefa {
    INICIAL(0),
    ABERTA(1),
    EM_ANDAMENTO(2),
    FECHADA(3);

    @Getter
    private final int id;

    StatusTarefa(int id) {
        this.id = id;
    }

}
