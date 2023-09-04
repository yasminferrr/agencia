package br.com.senai.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Candidato {
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private Genero genero;
    private String naturalidade;
    private String nacionalidade;
    private Endereco endereco;
    private List<Escolaridade> escolaridades = new ArrayList<>();
    private String calcularIdade;

    
    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
     }

    public String eMaiorDeIdade() {
    return calcularIdade() >= 18 ? "Sim" : "Não";
    }
    
    }

