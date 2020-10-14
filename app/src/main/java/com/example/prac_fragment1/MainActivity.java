package com.example.prac_fragment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MainFragment mainFragment;
    MenuFragment menuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 어떤 프래그먼트를 대상으로 할지 결정한다
        // 여기선 activity_main.xml에 있는 프래그먼트 틀을 지정
        mainFragment = (MainFragment) getSupportFragmentManager().
                findFragmentById(R.id.fragment2);

        // MenuFragment의 생성자 생성
        menuFragment = new MenuFragment();
    }
    //각 프래그먼트의 버튼 입력에 따른 행동
    public void onFragmentChanged(int index){
       if (index == 0){
           // container : activity_main의 최상위 레이아웃
           getSupportFragmentManager().beginTransaction().
                   replace(R.id.container, menuFragment).commit();
       }else if (index == 1){
           getSupportFragmentManager().beginTransaction().
                   replace(R.id.container, mainFragment).commit();
       }
    }
}