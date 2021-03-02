package com.redhat.abaroni.jvm.tuning.empty;

public class Main {
    public static void main(String... args) {
	try {
	    while (true) {
		Thread.sleep(2000);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
