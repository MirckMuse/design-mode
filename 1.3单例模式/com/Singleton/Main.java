package com.Singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SingleObject singleObject=SingleObject.getInstance();
        singleObject.showMessage();
    }
}
