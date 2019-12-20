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
//        String codBan;
//        String codBan2;
        String codBanco = "000";
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
        
        cliente.actualizarIngresos(null, new BigDecimal ("3.18"));
        Domicilio newDomi;
        newDomi = new Domicilio();
        newDomi.setCalle("Jovellanos ");
        newDomi.setNumero(208);
        newDomi.setPiso("7° Ñ");
        newDomi.setProvincia("CABA");
        
        System.out.println("Cliente: " + "DNI: " + cliente.getDni() + "//Nombre y Apellido: " + cliente.getNombreApellido() +
                "//Domicilio: " + newDomi.getCalle() + " " + newDomi.getNumero() + " " + newDomi.getPiso() + " " +
                " " + newDomi.getProvincia());
                       
        Banco codBan = Banco.obtener(); 
        Banco codBan2 = Banco.obtener();   
       
        System.out.println("codBan: " + codBan);
        System.out.println("codBan2: " + codBan2);
        
        System.out.println("codBan get: " + codBan.getCodigo());

//        String newBan = codBan.getCodigo();
//        System.out.println("Codigo Banco: " + newBan);
//        System.out.println(Banco.convertirAString());
        
        Banco codBan3 = Banco.obtener();
      
        codBan2.setCodigo(codBanco);
        System.out.println("Codigo2 Banco: " + codBan2.getCodigo());
        BigDecimal bd = new BigDecimal("5.3");
        Prestamo p1 = new PrestamoHipotecario( bd , 6);
        p1.imprimirDatos();
        BigDecimal bd2 = new BigDecimal("40.9"); 
        Prestamo p2 = new PrestamoPersonal( bd2 , 5);
        p2.imprimirDatos();
        BigDecimal bd3 = new BigDecimal("3.3");
        Prestamo p3 = new PrestamoHipotecario( bd3 , 3);
        p3.imprimirDatos();
        BigDecimal bd4 = new BigDecimal("25.6");
        Prestamo p4 = new PrestamoPersonal( bd4 , 8);
        p4.imprimirDatos();
        Prestamo[] prestamosDeMiCliente = {p1, p2, p3, p4};
//        prestamosDeMiCliente[0]=p1;
        cliente.setPrestamos(prestamosDeMiCliente);
//        prestamosDeMiCliente[1]=p2;
//        prestamosDeMiCliente[2]=p3;
//        prestamosDeMiCliente[3]=p4;
        cliente.imprimirDatos();
        
        
        
        
    }
    
}
