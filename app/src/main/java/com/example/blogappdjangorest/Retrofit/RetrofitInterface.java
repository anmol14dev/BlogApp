package com.example.blogappdjangorest.Retrofit;

import com.example.blogappdjangorest.Models.RetrofitModels.LoginResponse;
import com.example.blogappdjangorest.Models.RetrofitModels.PublicBlogResponse;
import com.example.blogappdjangorest.Models.RetrofitModels.SignUpResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @POST("login/")
    @FormUrlEncoded
    Call<LoginResponse> login(@Field("email") String email, @Field("password") String password);

    @POST("register/")
    @FormUrlEncoded
    Call<SignUpResponse> register(@Field("email") String email, @Field("password") String password, @Field("username") String username, @Field("first_name") String first_name, @Field("last_name") String last_name);

    @GET("public-blog")
    Call<ArrayList<PublicBlogResponse>> public_blog();
}