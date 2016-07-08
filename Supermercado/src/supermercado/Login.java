/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Custom
 */
public class Login {
    public static ArrayList<Cliente> banco = new ArrayList<Cliente>();
    
    public static Cliente loginCliente(){ //Retorna a conta a ser manipulada no menuPrincipal()
        Cliente cliente = null;
        Scanner teclado = new Scanner(System.in);
        
        if (banco.isEmpty() == true ){
            System.out.println("Cadastre-se primeiro");
            return null;
        }
        
        System.out.println("Login: ");
        String login = teclado.nextLine();
        System.out.println("Senha: ");
        String senha = teclado.nextLine();
        System.out.println("");
        
        for (int i = 0; i < banco.size(); i++){
            if (login.equals(banco.get(i).getLogin()) && 
                    senha.equals(banco.get(i).getSenha())){ //Checa validade
                cliente = banco.get(i);                     //do login/senha
            }                                               //para cada usuario
        }                                                   //no banco.
        
        if (cliente == null){
            System.out.println("");
            System.out.println("Login ou senha inválidos");
            System.out.println("");
            return loginCliente();
        }
        return cliente;
    }
    
    public static Gerente loginGerente(Gerente gerente, Estoque estoque){
        gerente.acessoAoEstoque(estoque);
        return gerente;
    }
    
}