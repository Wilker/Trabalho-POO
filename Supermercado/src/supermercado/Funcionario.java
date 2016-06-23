package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    protected String nomeFuncionario;
    protected String senhaFuncionario;
    protected int idFuncionario;
    
    Funcionario (){
        System.out.println("Cadastrando novo funcionário...");
        System.out.println("O nome será o usuário. Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        nomeFuncionario = teclado.nextLine();
        System.out.println("Agora digite sua senha: ");
        senhaFuncionario = teclado.nextLine();
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
