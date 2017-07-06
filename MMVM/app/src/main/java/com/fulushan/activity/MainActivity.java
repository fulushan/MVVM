package com.fulushan.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fulushan.R;
import com.fulushan.bean.UserEntity;
import com.fulushan.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserEntity user = new UserEntity();
        user.setAge(20);
        user.setUsername("zhangsan");
        user.setNickname("张三");
        user.setAvator("http://cdn2.jianshu.io/assets/web/logo-58fd04f6f0de908401aa561cda6a0688.png");
        activityMainBinding.setUser(user);



    }
}
