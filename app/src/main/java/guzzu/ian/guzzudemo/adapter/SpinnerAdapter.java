package guzzu.ian.guzzudemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



import java.util.List;

import guzzu.ian.guzzudemo.R;

/**
 * Created by Ian on 2018/1/12 0012.
 */

public class SpinnerAdapter extends BaseAdapter {
    private List<String> mList;
    private Context context;

    public SpinnerAdapter(Context context, List<String> mList) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.item_spinner,null);
        if (view!=null){
            TextView textView = view.findViewById(R.id.item);
            textView.setText(mList.get(position));
        }

        return view;
    }

}
