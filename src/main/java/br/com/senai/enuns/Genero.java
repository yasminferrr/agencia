package br.com.senai.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Genero {
    M("Masculino"), F("Feminino"), O("Outros");

    private String tipo;


    public String getTipo(){
        return tipo;
    }
}
