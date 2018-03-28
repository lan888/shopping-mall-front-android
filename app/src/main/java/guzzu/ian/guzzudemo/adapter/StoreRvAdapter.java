package guzzu.ian.guzzudemo.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;

import java.util.ArrayList;

import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.ui.OrderActivity;
import guzzu.ian.guzzudemo.utils.Utils;

/**
 * Created by Ian on 2018/3/12.
 */

public class StoreRvAdapter extends RecyclerView.Adapter<StoreRvAdapter.ViewHolder> {
    private Activity activity;
    private ArrayList<String> mStore_name;
    private ArrayList<String> storeId;


    public StoreRvAdapter(Activity activity, ArrayList<String> mStore_name, ArrayList<String> storeId) {
        this.activity = activity;
        this.mStore_name = mStore_name;
        this.storeId = storeId;

    }

    @Override
    public StoreRvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_store,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StoreRvAdapter.ViewHolder holder, int position) {
        holder.tv_store_name.setText(mStore_name.get(position));


    }

    @Override
    public int getItemCount() {
        return mStore_name.size();

    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_store_name;
        ButtonRectangle btn_choose;




        public ViewHolder(View itemView) {
            super(itemView);
            tv_store_name = itemView.findViewById(R.id.tv_store_name);
            btn_choose = itemView.findViewById(R.id.btn_choose);
            btn_choose.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Utils.start_Activity(activity,OrderActivity.class);
            Utils.putValue(activity,"storeId",storeId.get(getAdapterPosition()));
            Utils.putValue(activity,"storeName",mStore_name.get(getAdapterPosition()));




        }
    }
}
