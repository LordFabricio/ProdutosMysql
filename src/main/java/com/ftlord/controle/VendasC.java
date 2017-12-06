/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.controle;

import com.ftlord.dao.VendasDAO;
import com.ftlord.model.Vendas;

/**
 *
 * @author LordFabricio
 */
public class VendasC extends VendasDAO{
    
    /**
     * Metodo Salvar Produto
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe um Protudo
     * Retorna um Inteiro
     * @param v
     * @return 
     */
    public int salvarVC(Vendas v){
        return this.salvarV(v);
    }
    
    public Integer ultimoR(){
        return this.ultimoRegistro();
    }
}
