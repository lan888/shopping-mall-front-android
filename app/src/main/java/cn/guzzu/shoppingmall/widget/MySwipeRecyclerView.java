package cn.guzzu.shoppingmall.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

import cn.youngkaaa.yviewpager.YViewPager;

public class MySwipeRecyclerView extends RecyclerView {
    private YViewPager mVpParent;
    private float mLastY;
    private boolean disallow = true;
    public MySwipeRecyclerView(Context context) {
        this(context,null);
    }

    public MySwipeRecyclerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MySwipeRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent instanceof View){
            if (parent instanceof YViewPager){
                mVpParent = (YViewPager) parent;
                break;
            }
            parent = parent.getParent();
        }

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
            Log.d("MySwipe", "dispatchTouchEvent: "+ev.toString());
            float y = ev.getRawY();
            switch (ev.getAction()){
                case MotionEvent.ACTION_DOWN:
                    mLastY = y;
                    disallowViewpagerIntercept(true);
                    break;
                case MotionEvent.ACTION_MOVE:
                    disallowViewpagerIntercept(true);
                    break;
                case MotionEvent.ACTION_UP:
                    disallowViewpagerIntercept(true);
                    break;
                case MotionEvent.ACTION_CANCEL:
                    disallowViewpagerIntercept(true);
                    break;

            }

        return super.dispatchTouchEvent(ev);
    }

    private void initOnScrollListener(){
        addOnScrollListener( new OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                Log.d("MySwipe", "onScrollListener: "+computeVerticalScrollExtent()+","+computeVerticalScrollOffset()+","+computeVerticalScrollRange()+!canScrollVertically(-1)+!canScrollVertically(1)+newState);
                if (newState==1){

                    if (computeVerticalScrollExtent()==recyclerView.getMeasuredHeight()){
                        if (!canScrollVertically(-1)||!canScrollVertically(1)){
                            disallowViewpagerIntercept(false);
                        }
                    }
                }else {
                    disallowViewpagerIntercept(true);
                }

            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                    Log.d("MySwipe", "onScrolled: "+dx+dy);
                    if (!canScrollVertically(-1)||!canScrollVertically(1)){
                        disallowViewpagerIntercept(false);
                    } else {
                        disallowViewpagerIntercept(true);
                    }

            }
        });
    }

    private void handleScrollIntercept(float y){
        float deltaY = y-mLastY;
        if (!canScrollVertically(1)&&!canScrollVertically(-1)){
            disallowViewpagerIntercept(false);
        }else if (deltaY>0&&!canScrollVertically(-1)){
            if (deltaY>580){
                Log.d("MySwipe1", "dispatchTouchEvent: "+deltaY);
                disallowViewpagerIntercept(false);
            }else {
                disallowViewpagerIntercept(true);
            }
        }else if (deltaY<0&&!canScrollVertically(1)){
            if (deltaY<-580){
                Log.d("MySwipe2", "dispatchTouchEvent: "+deltaY);
                disallowViewpagerIntercept(false);
            }else {
                disallowViewpagerIntercept(true);
            }
        }else {
            disallowViewpagerIntercept(true);
        }
    }

    private void disallowViewpagerIntercept(boolean disallow){
        if (mVpParent==null)return;
        mVpParent.requestDisallowInterceptTouchEvent(disallow);
    }


}
