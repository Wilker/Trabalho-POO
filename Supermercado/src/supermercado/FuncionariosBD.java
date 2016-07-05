/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilker
 */
public class FuncionariosBD {

    private static int id;
    static List<Funcionario> db = new ArrayList<>();

    public FuncionariosBD() {
        FuncionariosBD.id = 1;
    }

    static void insereFuncionario(Funcionario funcionario) {
        funcionario.idFuncionario = id;
        db.add(funcionario);
        id++;
    }
}
