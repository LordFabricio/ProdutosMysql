/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftlord.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author LordFabricio
 */
public class Vendas {
    
    private Integer cupomId;
    private LocalDate data;
    private LocalTime hora;
    private String CNPJ;
    private String CPF;
    private double valorBruto;
    private double valorPago;
    private double valorTroco;
    
    public Vendas() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cupomId);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.hora);
        hash = 97 * hash + Objects.hashCode(this.CNPJ);
        hash = 97 * hash + Objects.hashCode(this.CPF);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valorBruto) ^ (Double.doubleToLongBits(this.valorBruto) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valorPago) ^ (Double.doubleToLongBits(this.valorPago) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valorTroco) ^ (Double.doubleToLongBits(this.valorTroco) >>> 32));
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
        final Vendas other = (Vendas) obj;
        if (Double.doubleToLongBits(this.valorBruto) != Double.doubleToLongBits(other.valorBruto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorPago) != Double.doubleToLongBits(other.valorPago)) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorTroco) != Double.doubleToLongBits(other.valorTroco)) {
            return false;
        }
        if (!Objects.equals(this.CNPJ, other.CNPJ)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        if (!Objects.equals(this.cupomId, other.cupomId)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.hora, other.hora)) {
            return false;
        }
        return true;
    }

    public Integer getCupomId() {
        return cupomId;
    }

    public void setCupomId(Integer cupomId) {
        this.cupomId = cupomId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(double valorTroco) {
        this.valorTroco = valorTroco;
    }

    @Override
    public String toString() {
        return "Cupom{" + "cupomId=" + cupomId + ", data=" + data + ", hora=" + hora + ", CNPJ=" + CNPJ + ", valorBruto=" + valorBruto + ", valorPago=" + valorPago + ", valorTroco=" + valorTroco + '}';
    }
    
}
