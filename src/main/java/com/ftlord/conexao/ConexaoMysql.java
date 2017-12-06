/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.conexao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LordFabricio
 */
public class ConexaoMysql {

    private boolean status = false; //Criado para o metodo Conectar() Caso True Confirma a Conexão com o banco de dados.
    private Connection con = null; //Criado para realizar a Conexão.
    private Statement statement; //Uma das Bibliotecas do Banco de Dados responsavel pela comunicação.
    private ResultSet resultSet; //Outra Biblioteca do Banco de Dados responsavel pela comunicação.
    private String server = "localhost:3306"; //Variavel Responsavel pela definição do LocalHost em seu PC.
    private String banco = "dbcasa"; //Nome do Schema do seu Banco de Dados.
    private String usuario = "root"; //Variavel associada a seu usuário de conexão com o servidor de banco de dados.
    private String senha = "root"; //Variavel Associada a sua senha de conexao com o servidor de banco de dados.

    /**
     * Construtor Vazio.
     */
    public ConexaoMysql() {
    }
    
    /**
     * Construtor que recebe 4 parametros tipo String.
     * @param pServer
     * @param pBanco
     * @param pUsuario
     * @param pSenha 
     */
    public ConexaoMysql(String pServer, String pBanco, String pUsuario, String pSenha) {
        this.server = pServer;
        this.banco = pBanco;
        this.usuario = pUsuario;
        this.senha = pSenha;
    }

    /**
     * Metodo de Conexão com o banco de dados
     * Retorna o status da Conexão.
     * @return 
     */
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://" + server + "/" + banco + "?autoReconnect=true&useSSL=false";
            this.setCon((Connection) DriverManager.getConnection(url, usuario, senha));
            this.status = true;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return this.getCon();
    }

    /**
     * Metodo que Recebe um parametro tipo String.
     * Usado para comunicação com o banco de dados.
     * Retorna Verdadeiro ou Falso dependendo do resultado da comunicação.
     * @param pMysql
     * @return 
     */
    public boolean executarMysql(String pMysql) {
        try {
            this.setStatement((Statement) getCon().createStatement());
            this.setResultSet(getStatement().executeQuery(pMysql));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Metodo que Recebe um parametro tipo String.
     * Usado para efetuar a Exclusão e Atualização de valores no banco de dados.
     * Retorna Verdadeiro ou Falso dependendo do resultado da comunicação.
     * @param pMysql
     * @return 
     */
    public boolean executarUpeDel(String pMysql) {
        try {
            this.setStatement((Statement) getCon().createStatement());
            getStatement().executeUpdate(pMysql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * Metodo que Recebe um parametro tipo String.
     * Usado para inserir valores no banco de dados.
     * Retorna um Inteiro de valor 0 caso de algo errado no processo de inserir.
     * @param pMysql
     * @return 
     */
    public int isertMysql(String pMysql) {
        int id = 0;
        try {
            this.setStatement((Statement) getCon().createStatement());
            this.getStatement().executeUpdate(pMysql);
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));

            while (this.resultSet.next()) {
                id = this.resultSet.getInt(1);
            }

            return id;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return id;
        }
    }

    /**
     * Metodo que realiza a desconeção com o banco de dado.
     * Retorna Verdadeiro ou Falso dependendo do resulado desta Ação.
     * @return 
     */
    public boolean desconectar() {
        try {
            if ((this.getResultSet() != null) && (this.statement != null)) {
                this.getResultSet().close();
                this.statement.close();
            }
            this.getCon().close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }

    //Todos Abaixo são Getters e Setters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
