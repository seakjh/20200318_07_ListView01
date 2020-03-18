package com.example.a20200318_07_listview01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.a20200318_07_listview01.adapters.StoreAdapter;
import com.example.a20200318_07_listview01.databinding.ActivityMainBinding;
import com.example.a20200318_07_listview01.datas.Store;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

//    가게 목록을 담아줄
    List<Store> storeDatas = new ArrayList<>();

    StoreAdapter storeAdapter = null;

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        addStores();

//        어댑터를 객체화 (우리가 작성한 생성자 활용)
        storeAdapter = new StoreAdapter(mContext, R.layout.store_list_item, storeDatas);
//         리스트 뷰와 어댑터를 연결
        binding.storeListView.setAdapter(storeAdapter);
    }

    void addStores(){

        storeDatas.add(new Store("삼겹더하기 본점", 4));
        storeDatas.add(new Store("밥풀주는 남자", 3));

    }

}
