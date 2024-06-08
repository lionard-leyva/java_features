package com.java.features.solid.liskov;

import java.util.logging.Logger;

public class Penguin extends Bird{
    Logger logger = Logger.getLogger(Penguin.class.getName());
    @Override
    public void fly(){
        logger.info("Penguin is not flying");
    }
}
