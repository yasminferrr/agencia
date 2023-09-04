package br.com.senai.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String cpfCnpj;
    private String nome;
    private String responsavel;
    private String telefone;
    private List<Vaga> vagas = new ArrayList<>();
}
