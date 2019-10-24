package com.example.changepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    public SecondFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.second_fragment,container,false);
    }

    public void onActivityCreated(Bundle savedInstanceState){  //页面中数据的初始化
        super.onActivityCreated(savedInstanceState);
        TextView tv=(TextView)getView().findViewById(R.id.secondTextView);
        tv.setText("this is the second page");
    }
}
