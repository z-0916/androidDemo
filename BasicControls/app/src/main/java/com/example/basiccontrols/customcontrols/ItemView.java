package com.example.basiccontrols.customcontrols;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.basiccontrols.R;

public class ItemView extends RelativeLayout {

    private RelativeLayout rLayout;
    private TextView tvLeft;
    private ImageView imLeft;
    private  ImageView imArrow;

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        /*
        * 加入布局文件
        * */
        LayoutInflater.from(context).inflate(R.layout.itemview_layout,this);
        rLayout=findViewById(R.id.rLayout);
        tvLeft=findViewById(R.id.tvLeft);
        imLeft=findViewById(R.id.imLeft);
        imArrow=findViewById(R.id.imArrow);
        /*
        *关联xml自定义属性
        * */
      TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.ItemView);
      String leftText=typedArray.getString(R.styleable.ItemView_leftText);
      boolean showArrow=typedArray.getBoolean(R.styleable.ItemView_showArrow,true);
//      设置属性
        setItemVIew(leftText,showArrow);
      /*
      * 要记得回收
      * */
        typedArray.recycle();
    }

    /*
    * 设置文字
    * @param tvLeftStr 左边内容
    * @param isshowArrow 是否显示小箭头
    * */
    public void setItemVIew(String tvLeftStr,boolean isShowArraw){
        if (tvLeftStr!=null){
            tvLeft.setText(tvLeftStr);
        }
        if (isShowArraw){
            imArrow.setVisibility(View.VISIBLE);
        }
        else {
            imArrow.setVisibility(View.GONE);
        }
    }
    /*
    自定义方法和事件：设置点击事件
     */
    public void setOnItemViewClickListener(OnClickListener onClickListener){
        rLayout.setOnClickListener(onClickListener);
    }
/*
获取左边内容
 */
    public String getLeftText(){
        return tvLeft.getText().toString();
    }
}
