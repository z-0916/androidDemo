package com.example.basiccontrols.customcontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.example.basiccontrols.R;

/*
滚动渐变顶部条
1.拿到ListVIEW滚动事件；
2.拿到高度变化；
3.根据高度变化，设置滚动条的背景；
 */
public class ScrollChangeView  extends ListView {
    private  View topBar;
    private  View viewHead;
    public ScrollChangeView(Context context, AttributeSet attrs,int defStyleAttr) {
        super(context, attrs,defStyleAttr);
         viewHead= LayoutInflater.from(context).inflate(R.layout.scroll_change_head,null);
         addHeaderView(viewHead);

        setOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                if (topBar != null) {
                    int headTop = viewHead.getTop();
                    headTop = Math.abs(headTop);
                /*
                设置背景透明度变化：全透明变成不透明 0——255
                 */
                    topBar.getBackground().setAlpha(headTop * (255 / 100));

                }
            }
        });
    }
    public void setTopBar(View view){
        topBar=view;
    }

}
