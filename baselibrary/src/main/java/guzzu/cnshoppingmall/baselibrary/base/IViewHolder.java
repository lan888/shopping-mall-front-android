package guzzu.cnshoppingmall.baselibrary.base;


import guzzu.cnshoppingmall.baselibrary.util.ViewEventListener;

public interface IViewHolder<T> {

    void setViewEventListener(ViewEventListener<T> viewEventListener);

    void setItem(T item);

    void setPosition(int position);
}
