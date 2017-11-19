/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.dao;

import com.ftlord.conexao.ConexaoMysql;
import com.ftlord.model.Produtos;
import java.util.ArrayList;

/**
 *
 * @author LordFabricio
 */
public class ProdutosDAO extends ConexaoMysql {

    /**
     * Metodo Salvar Produto no banco de dados.
     * Interpretador que realiza a comunicação da classe Produto com o Banco de Dados.
     * Recebe um Produto da Classe
     * Retornar um Inteiro
     * @param p
     * @return 
     */
    public int salvarP(Produtos p) {
        try {
            this.conectar();
            return this.isertMysql("INSERT INTO produtos ("
                    + "descricao,"
                    + "quantidade,"
                    + "valor_un"
                    + ") VALUES ("
                    + "'" + p.getDescProduto() + "',"
                    + "'" + p.getQuantProduto() + "',"
                    + "'" + p.getValorProduto() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconectar();
        }
    }

    /**
     * Metodo Excluir Produto no Banco de Dados
     * Interpretador que recebe o ID da classe Principal e Exclui no Banco de Dados.
     * Recebe o ID de um Produto
     * Retorna Verdadeiro ou Falso
     * @param pId
     * @return 
     */
    public boolean excluirP(int pId) {
        try {
            this.conectar();
            return this.executarUpeDel("DELETE FROM produtos WHERE id = '" + pId + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconectar();
        }
    }

    /**
     * Metodo Alterar Produto
     * Interpretador que realiza a comunicação da classe Produto com o Banco de Dados.
     * Recebe um Produto
     * Retorna Verdadeiro ou Falso
     * @param p
     * @return 
     */
    public boolean alterarP(Produtos p) {
        try {
            this.conectar();
            return this.executarUpeDel(
                    "UPDATE produtos SET "
                    + "descricao = '" + p.getDescProduto() + "',"
                    + "quantidade = '" + p.getQuantProduto() + "',"
                    + "valor_un = '" + p.getValorProduto() + "'"
                    + " WHERE id = '" + p.getIdProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconectar();
        }
    }

    /**
     * Metodo Pegar um Produto no Banco de Dados
     * Recebe o ID da janela Principal
     * Retorna o Produto
     * @param pId
     * @return 
     */
    public Produtos pegaP(int pId) {
        Produtos p = new Produtos();
        try {
            this.conectar();
            this.executarMysql(
                    "SELECT "
                    + "id, "
                    + "descricao,"
                    + "quantidade,"
                    + "valor_un"
                    + " FROM produtos WHERE id = '" + pId + "'"
            );
            while (this.getResultSet().next()){
                p.setIdProduto(this.getResultSet().getInt(1));
                p.setDescProduto(this.getResultSet().getString(2));
                p.setQuantProduto(this.getResultSet().getDouble(3));
                p.setValorProduto(this.getResultSet().getDouble(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return p;
    }
    
    /**
     * Metodo que Gerar uma Lista de Produtos
     * Retorna uma ArrayList de Produtos criada diretamente da comunicação com o Banco de Dados.
     * @return 
     */
    public ArrayList<Produtos> listaP(){
        ArrayList<Produtos> lp = new ArrayList<>();
        Produtos p = new Produtos();
        try {
            this.conectar();
            this.executarMysql(
                    "SELECT "
                    + "id, "
                    + "descricao,"
                    + "quantidade,"
                    + "valor_un"
                    + " FROM produtos;"
            );
            while (this.getResultSet().next()){
                p = new Produtos();
                p.setIdProduto(this.getResultSet().getInt(1));
                p.setDescProduto(this.getResultSet().getString(2));
                p.setQuantProduto(this.getResultSet().getDouble(3));
                p.setValorProduto(this.getResultSet().getDouble(4));
                lp.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return lp;
    }

}
