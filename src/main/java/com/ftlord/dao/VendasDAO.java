/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.dao;

import com.ftlord.conexao.ConexaoMysql;
import com.ftlord.model.Vendas;

/**
 *
 * @author LordFabricio
 */
public class VendasDAO extends ConexaoMysql{
    
    /**
     * Metodo Salvar Produto no banco de dados.
     * Interpretador que realiza a comunicação da classe Produto com o Banco de Dados.
     * Recebe um Produto da Classe
     * Retornar um Inteiro
     * @param v
     * @return 
     */
    public int salvarV(Vendas v) {
        try {
            this.conectar();
            return this.isertMysql("INSERT INTO cupom ("
                    + "data,"
                    + "hora,"
                    + "cnpj,"
                    + "cpf,"
                    + "valor_bruto,"
                    + "valor_pago,"
                    + "valor_troco"
                    + ") VALUES ("
                    + "'" + v.getData() + "',"
                    + "'" + v.getHora() + "',"
                    + "'" + v.getCNPJ() + "',"
                    + "'" + v.getCPF() + "',"        
                    + "'" + v.getValorBruto() + "',"   
                    + "'" + v.getValorPago() + "',"         
                    + "'" + v.getValorTroco() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconectar();
        }
    }
    
    public Integer ultimoRegistro() {
        int ultimo = 0;
        try {
            this.conectar();
            this.executarMysql(
                    "SELECT MAX(id)"
                    + " FROM cupom;"
            );
            while (this.getResultSet().next()){
                ultimo = (this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return ultimo;
    }
}
