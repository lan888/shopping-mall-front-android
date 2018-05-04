package guzzu.ian.baselibrary.base;


import guzzu.ian.baselibrary.util.ViewEventListener;

public interface IViewHolder<T> {

    void setViewEventListener(ViewEventListener<T> viewEventListener);

    void setItem(T item);

    void setPosition(int position);
}
