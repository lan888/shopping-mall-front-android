package guzzu.cnshoppingmall.baselibrary.util;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class DataBindingViewUtil {
    public static <T> void bindDataToLayout(List<T> datas, @NonNull ViewGroup layout, @LayoutRes int itemLayout, @NonNull OnBindingDataListener<T> listener){
        if (datas.isEmpty()||layout == null|| listener==null)return;
        final int childCount = layout.getChildCount();
        int curIndex = 0;
        final int size = datas.size();
        if (childCount>0){
            for (;curIndex<childCount;curIndex++){
                View v = layout.getChildAt(curIndex);
                if (v!=null){
                    listener.onBindData(v,datas.get(curIndex),curIndex);
                }
            }
        }
        final int sub = datas.size() - childCount;
        if (sub>0){
            for (int i =curIndex; i<size;i++){
                View v =View.inflate(layout.getContext(),itemLayout,null);
                if (listener instanceof OnBindingDataWithLayoutParamsListener){
                    ViewGroup.LayoutParams p;
                    if (((OnBindingDataWithLayoutParamsListener) listener).onCreateLayoutParams(v)==null){
                         p = ((OnBindingDataWithLayoutParamsListener) listener).onCreateLayoutParams(v,i);
                    }else {
                        p =(((OnBindingDataWithLayoutParamsListener) listener).onCreateLayoutParams(v));
                    }
                    if (p != null){
                        layout.addView(v,p);
                    }else {
                        layout.addView(v);
                    }
                }else {
                    layout.addView(v);
                }
                listener.onBindData(v,datas.get(i),i);
            }
        }else {
            layout.removeViews(curIndex,-sub);
        }
    }


    public interface OnBindingDataListener<T> {
        void onBindData(@NonNull View v, T data, int position);
    }

    public interface OnBindingDataWithLayoutParamsListener<T> extends OnBindingDataListener<T>{
        ViewGroup.LayoutParams onCreateLayoutParams(View v);
        ViewGroup.LayoutParams onCreateLayoutParams(View v,int position);
    }
}
