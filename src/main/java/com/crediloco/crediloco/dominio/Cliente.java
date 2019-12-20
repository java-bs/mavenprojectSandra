/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

import static com.crediloco.crediloco.dominio.ImprimirDatos.COLORSECUNDARIO;
import java.math.BigDecimal;


/**
 *
 * @author vazquez1320
 */
public class Cliente implements ImprimirDatos{
    public String dni;
    public String nombreApellido;
    public Domicilio domicilio;
    public BigDecimal ingresos;
    public DocumentoDigital[] dniDigitalizado;
    public Prestamo[] prestamos;
    
    
   
    public String toString(){
        return "DNI: " + this.dni + "// Nombre y Apellido: " + this.nombreApellido + "Domicilio: " + this.domicilio;
    }
    public void cambiarDomicilio(Domicilio newDomic){
        this.domicilio = newDomic;
    }
    public void actualizarIngresos(DocumentoDigital newDocu, BigDecimal monto){
        this.ingresos=monto;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Impresión Cliente: "
                + "Nombre = " + nombreApellido + ", ingresos = " + ingresos
                + ". Color de impresión: " + COLORSECUNDARIO);

        for (Prestamo prestamo : this.prestamos) {
            prestamo.imprimirDatos();
        }
        for(int i = 0 ; i > this.prestamos.length ; i++){
            this.prestamos[i].imprimirDatos();
            System.out.println("indice: " + i);
        }
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
