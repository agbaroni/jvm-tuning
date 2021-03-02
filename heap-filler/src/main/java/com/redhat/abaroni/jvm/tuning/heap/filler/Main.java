package com.redhat.abaroni.jvm.tuning.heap.filler;

import java.util.ArrayList;

public class Main {
    private static void fill() {
	ArrayList<Object> objs = new ArrayList<>();

	objs.add(objs);

	for (int i = 0; i < 1000000; ++i) {
	    objs.add(Main.class);
	}
    }

    public static void main(String... args) {
	try {
	    while (true) {
		Thread.sleep(2000);
		fill();
		System.gc();
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
