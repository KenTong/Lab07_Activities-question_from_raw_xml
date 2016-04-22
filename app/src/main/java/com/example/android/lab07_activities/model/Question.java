package com.example.android.lab07_activities.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;



@Root
public class Question {
    @Element
    private String desciption;
    @Element
    private String optionA;
    @Element
    private String optionB;
    @Element
    private String optionC;

    // 建構子
    public Question(String desciption, String optionA, String optionB, String optionC) {
        this.desciption = desciption;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }

    public Question(){

    }

    // getter
    public String getDesciption() {
        return desciption;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }
}
