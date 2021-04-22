package com.sahrul_nurfaizi.utsandroid.service;

import com.sahrul_nurfaizi.utsandroid.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
