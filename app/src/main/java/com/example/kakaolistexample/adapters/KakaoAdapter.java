package com.example.kakaolistexample.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kakaolistexample.R;
import com.example.kakaolistexample.datas.KakaoChat;

import java.util.List;

public class KakaoAdapter extends ArrayAdapter<KakaoChat> {

    Context mContext;
    List<KakaoChat> mList;
    LayoutInflater inf;

    public KakaoAdapter(Context context, List<KakaoChat> list){

        super(context, R.layout.kakao_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.kakao_list_item, null);
        }

        TextView idTxt = row.findViewById(R.id.idTxt);
        TextView timeTxt = row.findViewById(R.id.timeTxt);
        TextView messageTxt = row.findViewById(R.id.messageTxt);

        KakaoChat kakaoData = mList.get(position);

        idTxt.setText(kakaoData.userID);
        timeTxt.setText(kakaoData.date);
        messageTxt.setText(kakaoData.message);

        return row;
    }
}
