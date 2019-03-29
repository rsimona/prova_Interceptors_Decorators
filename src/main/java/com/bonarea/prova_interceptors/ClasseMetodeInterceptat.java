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
@RequestScoped
public class ClasseMetodeInterceptat {

    @AnotacioInterceptora
    public void metodeInterceptat() {
        System.out.println("Hola des del mètode interceptat de ClasseMetodeInterceptat");
    }

    public void metodeNoInterceptat() {
        System.out.println("Hola des del mètode NO interceptat");
    }
}
