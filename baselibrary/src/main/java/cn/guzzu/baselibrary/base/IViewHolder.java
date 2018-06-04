package cn.guzzu.baselibrary.base;


import cn.guzzu.baselibrary.util.ViewEventListener;

public interface IViewHolder<T> {

    void setViewEventListener(ViewEventListener<T> viewEventListener);

    void setItem(T item);

    void setPosition(int position);
}
