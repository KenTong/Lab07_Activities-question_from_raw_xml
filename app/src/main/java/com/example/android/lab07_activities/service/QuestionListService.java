package com.example.android.lab07_activities.service;


import com.example.android.lab07_activities.model.QuestionList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;

public interface QuestionListService {
    @GET("/uc?export=download&id=0B23pcVUPe1TVM0VGbmp6ajBGQW8")
    Call<QuestionList>getQuestionList();


    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://drive.google.com/")
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build();

}
