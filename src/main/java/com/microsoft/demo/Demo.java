package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered 2");
            return;
        }

        System.out.println("I am not covered 2");
    }
}
