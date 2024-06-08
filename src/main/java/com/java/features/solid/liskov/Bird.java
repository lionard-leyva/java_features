package com.java.features.solid.liskov;

import java.util.logging.Logger;

public class Bird {
    Logger logger = Logger.getLogger(Bird.class.getName());
    public  void fly(){
        logger.info("Bird is flying");
    }
}
