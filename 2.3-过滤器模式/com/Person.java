package com.Singleton;

/**
 * 创建一个类，在该类上应用标准
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatu;

    public Person(String name, String gender, String maritalStatu) {
        this.name = name;
        this.gender = gender;
        this.maritalStatu = maritalStatu;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatu() {
        return maritalStatu;
    }
}
