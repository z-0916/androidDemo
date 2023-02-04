package com.example.basiccontrols.customcontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class LineView extends View {
    public LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*
        创建画笔
         */
        Paint p=new Paint();
//        设置画笔颜色
        p.setColor(Color.BLUE);
        int xPoint=200;
        int yPoint=800;
//        y轴
        canvas.drawLine(xPoint,yPoint-600,xPoint,yPoint,p);
//        x轴
        canvas.drawLine(xPoint,yPoint,xPoint+300,yPoint,p);
        canvas.drawLine(xPoint,yPoint,xPoint+50,yPoint-300,p);
        canvas.drawLine(xPoint+50,yPoint-300,xPoint+120,yPoint-150,p);
        canvas.drawLine(xPoint+120,yPoint-150,xPoint+170,yPoint-400,p);
        canvas.drawLine(xPoint+170,yPoint-400,xPoint+210,yPoint-200,p);
    }
}
