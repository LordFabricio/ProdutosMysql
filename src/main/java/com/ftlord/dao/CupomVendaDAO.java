/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.dao;

import com.ftlord.conexao.ConexaoMysql;
import com.ftlord.model.CupomVenda;


/**
 *
 * @author LordFabricio
 */
public class CupomVendaDAO extends ConexaoMysql{
    
    /**
     * Metodo Salvar Produto no banco de dados.
     * Interpretador que realiza a comunicação da classe Produto com o Banco de Dados.
     * Recebe um Produto da Classe
     * Retornar um Inteiro
     * @param cv
     * @return 
     */
    public int salvarCV(CupomVenda cv) {
        try {
            this.conectar();
            return this.isertMysql("INSERT INTO cupom_venda ("
                    + "cupom_id,"
                    + "produtos_id,"
                    + "quantidade,"
                    + "valor_u,"
                    + "valor_t"
                    + ") VALUES ("
                    + "'" + cv.getIdCupom() + "',"
                    + "'" + cv.getIdProduto() + "',"
                    + "'" + cv.getQuantidade() + "',"
                    + "'" + cv.getValorU() + "',"   
                    + "'" + cv.getValorT() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconectar();
        }
    }
    
}
