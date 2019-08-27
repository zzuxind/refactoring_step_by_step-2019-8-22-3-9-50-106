package com.tws.refactoring;

public class Police {
	final int checkAge=18;
    public boolean checkDriver(Driver driver) {
        if(driver.getAge() >= checkAge) 
        	return true;
        else return false;
    }
}
