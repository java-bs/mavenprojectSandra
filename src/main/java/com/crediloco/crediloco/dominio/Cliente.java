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
public class Cliente {
    public String dni;
    public String nombreApellido;
    public Domicilio domicilio;
    public BigDecimal ingresos;
    public DocumentoDigital[] dniDigitalizado;
    public Prestamo[] prestamos;
    
    public String toString(){
        return "DNI: " + dni + "// Nombre y Apellido: " + nombreApellido + "Domicilio: " + domicilio;
    }
    public void cambiarDomicilio(Domicilio newDomic){
        domicilio = newDomic;
    }
    public void actualizarIngresos(DocumentoDigital newDocu, BigDecimal monto){
        ingresos=monto;
    }

    public String getDni() {
        return dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public DocumentoDigital[] getDniDigitalizado() {
        return dniDigitalizado;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public void setDniDigitalizado(DocumentoDigital[] dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
}
