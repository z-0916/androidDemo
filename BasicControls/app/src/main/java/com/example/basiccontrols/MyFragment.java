package com.example.basiccontrols;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.basiccontrols.customcontrols.ItemView;
import com.example.basiccontrols.customcontrols.ScrollChangeView;

public class MyFragment extends Fragment {

    private ItemView itemView1;
    private Context context;
    private LinearLayout topBar;
    private ScrollChangeView scv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        context=getActivity();
        View view = inflater.inflate(R.layout.my_fragment, container, false);
         /*
        在fragment中获取ui控件
         */
        itemView1=view.findViewById(R.id.iv1);
        topBar=view.findViewById(R.id.topBar);
        scv=view.findViewById(R.id.scv);
        scv.setTopBar(topBar);
        scv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 60;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                TextView tv= new TextView(context);
                tv.setText("+"+i);
                return tv;
            }
        });
        return view;

    }

    @Override
    /*
    * 该方法activity和fragment都创建好l
    * */
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
         /*
        第一个自定义控件itemview1设置点击事件，弹出左边文本框内容
         */
        super.onActivityCreated(savedInstanceState);
        itemView1.setOnItemViewClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, itemView1.getLeftText(), Toast.LENGTH_LONG).show();
            }
        });
    }
    }

