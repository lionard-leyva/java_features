package com.java.features.solid.liskov;

import java.util.logging.Logger;

public class Duck extends Bird{
    Logger logger = Logger.getLogger(Duck.class.getName());
    @Override
    public void fly(){
       logger.info("Duck is flying");
    }
}
