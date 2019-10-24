package com.example.changepage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
    public HomeFragment(){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.frame_home,container,false); //创建主页面fragment,加载对应的activity
    }

    public void onActivityCreated(Bundle savedInstanceState){  //页面中数据的初始化
        super.onActivityCreated(savedInstanceState);
        TextView tv=(TextView)getView().findViewById(R.id.homeTextView);
        tv.setText("this is the home page");
    }
}
