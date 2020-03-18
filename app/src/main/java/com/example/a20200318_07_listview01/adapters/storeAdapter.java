package com.example.a20200318_07_listview01.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.a20200318_07_listview01.datas.Store;

import java.util.List;

// alt + enter
public class storeAdapter extends ArrayAdapter<Store> {
// 어댑터에서 종종 사용하는 변수 세가지 정의
    Context mContext;   // 화면과의 연결고리
    List<Store> mList;  // 뿌려줄 데이터목록 담는 변수
    LayoutInflater inf; // xml -> 객체화 시켜주는 역할 클래스

//                                         화면           모양                          배열
    public storeAdapter(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);

//        생성자가 실행될때 세개의 변수를 채워줌.
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);

    }

}
