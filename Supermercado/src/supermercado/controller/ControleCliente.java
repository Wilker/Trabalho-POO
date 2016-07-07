/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado.controller;

import java.util.Scanner;
import supermercado.Login;
import supermercado.Valida;

/**
 *
 * @author wilker
 */
public class ControleCliente {

    Scanner teclado = new Scanner(System.in);

    public void cadastrar() {
        String nome;
        String email;
        int cpf;
        String login;
        String senha;

        do {
            System.out.println("Informe seu nome");
            nome = teclado.nextLine();
            System.out.println("Informe seu email");
            email = teclado.next();

            System.out.println("Digite seu novo login: ");
            login = teclado.next();
            System.out.println("Login registrado!");

            System.out.println("Digite sua nova senha: ");
            senha = teclado.next();
            System.out.println("Senha registrado!");
            if (Valida.validaNome(login) || Valida.validaSenha(senha)) {
                System.out.println("Login ou senha vazios não são permitidos");
            }
        } while (Valida.validaNome(login) && Valida.validaSenha(senha));

        System.out.println("Digite seu CPF(sem traços): ");
        cpf = teclado.nextInt();

        // Login.banco.add(this);
        System.out.println("Cadastrado com sucesso!");
        System.out.println("");
    }
}
