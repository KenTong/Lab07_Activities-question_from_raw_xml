package com.example.android.lab07_activities.model;

import com.example.android.lab07_activities.model.Question;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root
public class QuestionList {
    @ElementList
    private List<Question> list;

    public  List<Question> getlist() {
        return list;
    }
}
