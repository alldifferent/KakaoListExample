package com.example.kakaolistexample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kakaolistexample.adapters.KakaoAdapter;
import com.example.kakaolistexample.databinding.ActivityMainBinding;
import com.example.kakaolistexample.datas.KakaoChat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;
    List<KakaoChat> kakaoList = new ArrayList<>();
    KakaoAdapter kakaoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupEvents();
        setValues();
        fillKakao();


    }

    void setupEvents(){


    }

    void setValues(){

        kakaoAdapter = new KakaoAdapter(MainActivity.this, kakaoList);
        act.chatList.setAdapter(kakaoAdapter);

    }

    public static String timeHMS(){

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        return sdf.format(cal.getTime());

    }

    void fillKakao(){

        kakaoList.add(new KakaoChat("alldi", "안녕하세요.", timeHMS()));
        kakaoList.add(new KakaoChat("eiww", "Hello.", timeHMS()));
        kakaoList.add(new KakaoChat("fffww", "yo.", timeHMS()));
        kakaoList.add(new KakaoChat("zqqqw", "what are you doing.", timeHMS()));
        kakaoList.add(new KakaoChat("rrddqqqq", "안녕하세요.", timeHMS()));
        kakaoList.add(new KakaoChat("gggddd", "kkkk.", timeHMS()));

    }

}
