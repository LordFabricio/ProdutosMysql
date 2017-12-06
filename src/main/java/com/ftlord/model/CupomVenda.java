/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.model;

import java.util.Objects;

/**
 *
 * @author LordFabricio
 */
public class CupomVenda{
    
    Integer idCupom;
    Integer idProduto;
    double quantidade;
    double valorU;
    double valorT;

    public CupomVenda() {
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.idCupom);
        hash = 73 * hash + Objects.hashCode(this.idProduto);
        hash = 73 * hash + Objects.hashCode(this.quantidade);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.valorU) ^ (Double.doubleToLongBits(this.valorU) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.valorT) ^ (Double.doubleToLongBits(this.valorT) >>> 32));
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
        final CupomVenda other = (CupomVenda) obj;
        if (Double.doubleToLongBits(this.valorU) != Double.doubleToLongBits(other.valorU)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorT) != Double.doubleToLongBits(other.valorT)) {
            return false;
        }
        if (!Objects.equals(this.idCupom, other.idCupom)) {
            return false;
        }
        if (!Objects.equals(this.idProduto, other.idProduto)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        return true;
    }

    public Integer getIdCupom() {
        return idCupom;
    }

    public void setIdCupom(Integer idCupom) {
        this.idCupom = idCupom;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorU() {
        return valorU;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }

    public double getValorT() {
        return valorT;
    }

    public void setValorT(double valorT) {
        this.valorT = valorT;
    }

    @Override
    public String toString() {
        return "CupomVendas{" + "idCupom=" + idCupom + ", idProduto=" + idProduto + ", quantidade=" + quantidade + ", valorU=" + valorU + ", valorT=" + valorT + '}';
    }
    
}
