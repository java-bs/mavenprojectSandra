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
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigDecimal newMonto;
        newMonto = new BigDecimal("1550.25");
        Integer cuotas = new Integer(6);
        Prestamo prestamo = new Prestamo(newMonto, cuotas);
        prestamo.setCantidadCuotas(6);
        prestamo.setPlazoEnMeses(3);
     
        //prestamo.setMonto(newMonto);
        //prestamo.setPlazoEnMeses(6);
        BigDecimal newTasa;
        newTasa = new BigDecimal ("3.18");
        prestamo.setTasa (newTasa);
        System.out.println("Prestamo: " + "Cantidad de cuotas: " + prestamo.getCantidadCuotas() + 
                "// Monto: " + prestamo.getMonto() + "// Plazo en meses: " + prestamo.getPlazoEnMeses()
                + "// Tasa: " + prestamo.getTasa());
        
        Cliente cliente = new Cliente();
        cliente.setDni("22.004.875");
        cliente.setNombreApellido("Sandra Vazquez");
        Domicilio newDomi;
        newDomi = new Domicilio();
        newDomi.setCalle("Jovellanos ");
        newDomi.setNumero(208);
        newDomi.setPiso("7° Ñ");
        newDomi.setProvincia("CABA");
        
        System.out.println("Cliente: " + "DNI: " + cliente.getDni() + "//Nombre y Apellido: " + cliente.getNombreApellido() +
                "//Domicilio: " + newDomi.getCalle() + " " + newDomi.getNumero() + " " + newDomi.getPiso() + " " +
                " " + newDomi.getProvincia());
                       
        
        
        // TODO code application logic here
    }
    
}
