/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_interceptors;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ramon.simona
 */
@AnotacioInterceptora
@RequestScoped
public class ClasseSenceraInterceptada {

    public void metode1() {
        System.out.println("Hola des del mètode 1 de ClasseSenceraInterceptada");
    }

    public void metode2() {
        System.out.println("Hola des del mètode 2 de ClasseSenceraInterceptada");
    }
}
