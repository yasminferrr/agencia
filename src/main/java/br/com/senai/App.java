package br.com.senai;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Cliente;
import br.com.senai.models.Vaga;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class App 
{
        /**
         * @param args
         */
        public static void main(String[] args){

            //Instanciando uma vaga
            Vaga ti = new Vaga();
            ti.setTitulo("Suporte técnico");
            ti.setNumeroDeVaga(2);
            ti.setDescricao("Deverá ter conhecimento em montagem e manutenção de computadores");
            ti.setSalario(1900.0);
            ti.setInicioPublicacao(LocalDate.of(2023, 8, 20));
            ti.setFimPublicacao(LocalDate.of(2023, 9, 4));

            //Instanciando um cliente 
            Cliente senai = new Cliente();
            senai.setNome("Senai");
            senai.setResponsavel("Araidna");
            senai.setCpfCnpj("00.003.556/0003-88");

            ti.setCliente(senai); //Associando o cliente a vaga

            //Instanciando 02 candidatos
            Candidato joao = new Candidato();
            joao.setNomeCompleto("João Henrique");
            joao.setDataNascimento(LocalDate.of(1993, 10, 15));
            joao.setGenero(Genero.M);

            Candidato maria = new Candidato();
            maria.setNomeCompleto("Maria Helena");
            maria.setDataNascimento(LocalDate.of(1992, 12, 18));
            maria.setGenero(Genero.F);

            ti.getCandidatos().addAll(Arrays.asList(joao, maria));

            System.out.println("Nome da vaga: "+ti.getTitulo()+
            "\nSalário: "+ti.getSalario()+
            "\nInício: "+ti.getInicioPublicacao()+
            "\nEntregar até: "+ti.getFimPublicacao()+
            "\nEmpresa: "+ti.getCliente().getNome()
            );

            for (Candidato candidato: ti.getCandidatos()) {
                System.out.println("Nome: " +candidato.getNomeCompleto());
            }
        }
}
