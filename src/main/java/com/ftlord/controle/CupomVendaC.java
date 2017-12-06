/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.controle;

import com.ftlord.dao.CupomVendaDAO;
import com.ftlord.model.CupomVenda;


/**
 *
 * @author LordFabricio
 */
public class CupomVendaC extends CupomVendaDAO{
    
    /**
     * Metodo Salvar Produto
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe um Protudo
     * Retorna um Inteiro
     * @param cv
     * @return 
     */
    public int salvarCVC(CupomVenda cv){
        return this.salvarCV(cv);
    }
    
}
