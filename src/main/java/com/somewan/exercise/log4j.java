package com.somewan.exercise;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by wan on 2017/1/23.
 */
public class log4j {
    private static Logger log = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {
        log.info("hello");
        User wan = new User("WanFadong", 25);
        log.error(wan);
    }
}
