package com.intetm.web;

import com.intetm.di.annotation.BootApplication;
import com.intetm.di.application.DIApplication;

@BootApplication(scanPackage = "com.intetm.web")
public class Application {

    public static void main(String ...args) {
        DIApplication.run(Application.class, args);
    }
}
