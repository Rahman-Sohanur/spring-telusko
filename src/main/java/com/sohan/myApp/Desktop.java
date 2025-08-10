    package com.sohan.myApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling  404 bugs but faster");
    }
}
