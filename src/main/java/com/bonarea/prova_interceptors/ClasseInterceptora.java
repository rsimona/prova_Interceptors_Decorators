/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.prova_interceptors;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author ramon.simona
 */
@Interceptor
@AnotacioInterceptora
@Priority(Interceptor.Priority.APPLICATION)
public class ClasseInterceptora {
    @AroundInvoke
    public Object metodeInterceptor(InvocationContext ic){
        try {
            System.out.println("Hola des del mètode interceptor");
            return ic.proceed();
        } catch (Exception ex) {
            Logger.getLogger(ClasseInterceptora.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
