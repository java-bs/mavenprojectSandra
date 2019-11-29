/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

/**
 *
 * @author vazquez1320
 */
public class Domicilio {
    String calle;
    Integer numero;
    String piso;
    String provincia; 

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    
}
