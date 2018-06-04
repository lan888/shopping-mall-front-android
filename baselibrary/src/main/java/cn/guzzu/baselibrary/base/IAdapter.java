package cn.guzzu.baselibrary.base;



import java.util.List;

import cn.guzzu.baselibrary.util.ViewEventListener;

public interface IAdapter<T> {

    void setItems(List<T> items);

    void addItem(T item);

    void delItem(T item);

    void addItems(List<T> items);

    void clearItems();

    T getItem(int position);

    ViewEventListener<T> getViewEventListener();

    void setViewEventListener(ViewEventListener<T> viewEventListener);
}