/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_decorators;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

/**
 *
 * @author ramon.simona
 */
@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class ClasseDecoradora implements InterfaceDecoradora {

    @Inject
    @Delegate
    InterfaceDecoradora interfaceDecoradora;

    @Override
    public String metode() {
        return "Hola des de la classe decoradora <br>" + interfaceDecoradora.metode();
    }

}
