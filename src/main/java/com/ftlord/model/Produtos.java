/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.model;

import java.util.Objects;

/**
 * Classe Padrao para a Manupulação de Produtos.
 * @author LordFabricio
 */
public class Produtos {
    
    private int idProduto;
    private String descProduto;
    private Double quantProduto;
    private Double valorProduto;

    public Produtos() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idProduto;
        hash = 17 * hash + Objects.hashCode(this.descProduto);
        hash = 17 * hash + Objects.hashCode(this.quantProduto);
        hash = 17 * hash + Objects.hashCode(this.valorProduto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        if (!Objects.equals(this.descProduto, other.descProduto)) {
            return false;
        }
        if (!Objects.equals(this.quantProduto, other.quantProduto)) {
            return false;
        }
        if (!Objects.equals(this.valorProduto, other.valorProduto)) {
            return false;
        }
        return true;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public Double getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(Double quantProduto) {
        this.quantProduto = quantProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return "Produtos{" + "idProduto=" + idProduto + ", descProduto=" + descProduto + ", quantProduto=" + quantProduto + ", valorProduto=" + valorProduto + '}';
    }
    
}
