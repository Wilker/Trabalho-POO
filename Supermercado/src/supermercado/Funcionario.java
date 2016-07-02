package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    protected String nomeFuncionario;
    protected int idFuncionario;
    
    Funcionario (String nome){
        this.nomeFuncionario = nome;
        idFuncionario = (int) (Math.random()*100);
        System.out.println("Funcionario registrado com sucesso: ");
        System.out.println("");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Seu numero de identificação é: " + idFuncionario);
        System.out.println("");
    }
    
    public String getNome(){
        return nomeFuncionario;
    }
    
    
}
