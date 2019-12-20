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
public class PrestamoHipotecario extends Prestamo{
    
    public PrestamoHipotecario(BigDecimal monto, Integer cuotas) {
        super(monto, cuotas);
    }
    
    
}
