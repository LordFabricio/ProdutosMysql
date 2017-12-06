/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.controle;

import com.ftlord.dao.ProdutosDAO;
import com.ftlord.model.Produtos;
import java.util.ArrayList;

/**
 *
 * @author LordFabricio
 */
public class ProdutosC extends ProdutosDAO{
    
    /**
     * Metodo Salvar Produto
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe um Protudo
     * Retorna um Inteiro
     * @param p
     * @return 
     */
    public int salvarPC(Produtos p){
        return this.salvarP(p);
    }
    
    /**
     * Metodo Excluir Produto
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe o ID do Produto
     * Retornar Verdadeiro ou Falso
     * @param pId
     * @return 
     */
    public boolean escluirPC(int pId){
        return this.excluirP(pId);
    }
    
    /**
     * Metodo Alterar Produto
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe um Produto
     * Retornar Verdadeiro ou Falso
     * @param p
     * @return 
     */
    public boolean alterarPC(Produtos p){
        return this.alterarP(p);
    }
    
    public boolean alterarProdutoCupom(Produtos p){
        return this.alterarProdutoCupom(p);
    }
    
    /**
     * Metodo Selecionar um Produto pela ID
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Recebe o ID do Produto.
     * Retornar o Produto.
     * @param pId
     * @return 
     */
    public Produtos pegaPC (int pId){
        return this.pegaP(pId);
    }
    
    /**
     * Metodo Selecionar Todos os Produtos
     * Realiza a comunicação entre a classe ProdutosDAO e a Produtos
     * Retorna uma ArrayList de Produtos
     * @return 
     */
    public ArrayList<Produtos> listaPC(){
        return this.listaP();
    }
}
