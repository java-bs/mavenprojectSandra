/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

/**
 *
 * @author vazquez1320
 */
public class Prestamo implements ImprimirDatos {
    private BigDecimal monto;
    public Integer plazoEnMeses;
    public Integer cantidadCuotas;
    public BigDecimal tasa;
    public DocumentoDigital[] documentos;
    
    public Prestamo (BigDecimal monto, Integer cuotas){
        this.monto = monto;
        this.cantidadCuotas = cuotas;
    }
    
    public String toString(){
        return "Monto: " + this.monto + "//Cantidad de cuotas: " + this.cantidadCuotas;
    }

    public BigDecimal getMonto() {
        return this.monto;
    }

    public Integer getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public DocumentoDigital[] getDocumentos() {
        return documentos;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public void setPlazoEnMeses(Integer plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public void setDocumentos(DocumentoDigital[] documentos) {
        this.documentos = documentos;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Monto: " + this.monto + "\nTasa: " + this.tasa
                            +"\nCantidad de cuotas: " + this.cantidadCuotas
        );
    }
    
}
