/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crediloco.crediloco.dominio;

import java.util.Date;

/**
 *
 * @author vazquez1320
 */
public class DocumentoDigital {
    public String nombre;
    public Date fechaDeCarga;
    public Byte[] imagen;

    public String getNombre() {
        return nombre;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }
    
}
