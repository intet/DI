package com.intetm.di.application;

import com.intetm.di.annotation.Bean;
import com.intetm.di.annotation.BootApplication;
import org.reflections.Reflections;

import java.util.Set;

public class DIApplication {

    public static void run(Class<?> clazz, String ...args){

        String scanPackage;
        BootApplication bootApplication = clazz.getAnnotation(BootApplication.class);
        if(bootApplication!=null){
            scanPackage = bootApplication.scanPackage();
        }
        else {
            scanPackage = clazz.getPackage().getName();
        }

        Reflections reflections = new Reflections(scanPackage);
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(Bean.class);
        System.out.println(annotated.size());
    }
}
