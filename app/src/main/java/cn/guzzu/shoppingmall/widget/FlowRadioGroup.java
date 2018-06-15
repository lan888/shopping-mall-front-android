package cn.guzzu.shoppingmall.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

import cn.guzzu.baselibrary.base.BaseApp;

public class FlowRadioGroup extends RadioGroup {
    public FlowRadioGroup(Context context) {
        super(context);
    }

    public FlowRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int maxWidth = MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        int x = 0;
        int y = 0;
        int row = 0;

        for (int index = 0; index < childCount; index++) {
            final View child = getChildAt(index);
            if (child.getVisibility() != View.GONE) {
                child.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
                // 此处增加onlayout中的换行判断，用于计算所需的高度
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int marginLeft = lp.leftMargin;
                int marginTop = lp.topMargin;
                int marginRight = lp.rightMargin;
                int marginBottom = lp.bottomMargin;
                int width = child.getMeasuredWidth()+marginLeft+marginRight;
                int height = child.getMeasuredHeight()+marginTop+marginBottom;
                x += width;
                y = row * height + height;
                if (x > maxWidth) {
                    x = width;
                    row++;
                    y = row * height + height;
                }
            }
        }
        // 设置容器所需的宽度和高度
        setMeasuredDimension(maxWidth, y);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int childCount = getChildCount();
        int maxWidth = r;
        int x = 0;
        int y = 0;
        int row = 0;
        for (int i = 0; i < childCount; i++) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != View.GONE) {
                LayoutParams lp = (LayoutParams) child.getLayoutParams();
                int marginLeft = lp.leftMargin;
                int marginTop = lp.topMargin;
                int marginRight = lp.rightMargin;
                int marginBottom = lp.bottomMargin;
                int width = child.getMeasuredWidth()+marginLeft+marginRight;
                int height = child.getMeasuredHeight()+marginBottom+marginTop;
                x += width;
                y = row * height + height;
                if (x > maxWidth) {
                    x = width;
                    row++;
                    y = row * height + height;
                }
                child.layout(x - width+marginLeft, y - height+marginTop, x-marginRight> BaseApp.width?BaseApp.width-marginRight:x-marginRight, y-marginBottom);


            }
        }
    }

}
