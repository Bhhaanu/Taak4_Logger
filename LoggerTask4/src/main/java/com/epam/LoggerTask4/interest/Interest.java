package com.epam.LoggerTask4.interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static java.lang.Math.pow;

public class Interest {
	private static final Logger LOGGER= LogManager.getLogger(Interest.class);
    public double simple_interest(double principal,double rate,double time){
    	LOGGER.error("Welcom to simple_interest()...run..exit");
        return (principal*time*rate)/100;
    }
    public double compound_interest(double principal,double rate,double time){
    	LOGGER.error("welcome to compound_interest()...run...exit");
        return principal*pow((1.0+rate/100.0),time)-principal;
    }

}
