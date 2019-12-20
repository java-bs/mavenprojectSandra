/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

import java.util.logging.Logger;

/**
 *
 * @author vazquez1320
 */
public class Banco {

    private static String codigo = "700";
    private static Banco banco;
  
    
    private Banco(String codigo){
       this.codigo=codigo;  
    }
        
    public static Banco obtener(){
       if (banco == null) {
            banco = new Banco("SNZ");
            return banco;
        } else {
            return banco;
        }
    }

    public String getCodigo() {
        return codigo;
//        System.out.println(codigo + "Codigo: ");
    }

   
    public static void setCodigo(String cod) {
        codigo = cod;
    }
    //metódo perteneciente a la clase
    public static String convertirAString() {
        return "Banco " + banco.codigo;
    }

    //metódo perteneciente al objeto creado
    public String toString() {
        return "Banco{" + "codigo=" + codigo + '}';
    }

    

    
}
