/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmodena.helper;

/**
 *
 * @author dmodena
 */
public class Helper {
    public static double arredondar(double numero, int casas) {
        return ((Math.round(numero * 100)) / 100.0);        
    }
}
