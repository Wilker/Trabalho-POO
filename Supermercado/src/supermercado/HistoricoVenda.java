/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Custom
 */
public class HistoricoVenda {
    static ArrayList<Pedido> vendas = new ArrayList<>();
    
    static void imprimeVendas(){
        for (Pedido venda : vendas) {
            venda.imprimeVenda();
        }
    }
}