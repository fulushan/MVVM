package com.fulushan.bean;

import android.content.Intent;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.fulushan.activity.ProductListActivity;
import com.squareup.picasso.Picasso;

/**
 * Author： fulushan
 * Created  on 2017/7/6
 * Emain:  fulushan@sina.cn
 */
public class UserEntity {
    private String username;
    private String nickname;
    private int age;
    private String avator;

    public UserEntity() {
    }

    public UserEntity(String username, String nickname, int age, String avator) {
        this.username = username;
        this.nickname = nickname;
        this.age = age;
        this.avator = avator;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @BindingAdapter("bind:avator")
    public static void getUserAvator(ImageView iv, String avator) {
        Picasso.with(iv.getContext()).load(avator).into(iv);
    }

    public void onItemClick(View view) {
        Intent intent = new Intent(view.getContext(), ProductListActivity.class);
        view.getContext().startActivity(intent);
    }
}
