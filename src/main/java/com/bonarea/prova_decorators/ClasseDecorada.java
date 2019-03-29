/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_decorators;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ramon.simona
 */
@RequestScoped
public class ClasseDecorada implements InterfaceDecoradora {

    @Override
    public String metode() {
        return "Hola des de la classe decorada";
    }
    
}
