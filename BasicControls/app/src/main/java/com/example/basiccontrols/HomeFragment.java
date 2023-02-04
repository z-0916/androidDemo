package com.example.basiccontrols;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

public class HomeFragment extends Fragment {
    /*
    * 静态加载fragment方法：
    * 1.编写fragment1.xml文件；
    * 2.编写类继承fragment；
    * 3.在编写的类中通过LayoutInflater的inflate()方法加载第一步定义的xml布局文件；
    * 4.在相应activity中写<fragment>标签,其中android:name属性为第二步编写类的路径；
    * */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_fragment,container,false);
        return  view;
    }
}
