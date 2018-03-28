package guzzu.ian.guzzudemo.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import guzzu.ian.guzzudemo.R;
import guzzu.ian.guzzudemo.ui.OrderDetailActivity;
import guzzu.ian.guzzudemo.utils.Utils;

/**
 * Created by Ian on 2018/3/12.
 */

public class OrderRvAdapter extends RecyclerView.Adapter<OrderRvAdapter.ViewHolder> {
    private Activity context;
    private ArrayList<String> mBill_num;
    private ArrayList<String> mBill_createAt;
    private ArrayList<String> mOrder_status;
    private ArrayList<String> mPayment_status;
    private ArrayList<String> mShipping_status;
    private ArrayList<String> mCustomer_name;
    private ArrayList<String> mTotal_pay;
    private ArrayList<String> mOrder_id = new ArrayList<String>();
    private String storeId;
    private String userId;

    public OrderRvAdapter(Activity context,String storeId,String userId,ArrayList<String> mOrder_id, ArrayList<String> mBill_num, ArrayList<String> mBill_createAt, ArrayList<String> mOrder_status, ArrayList<String> mPayment_status, ArrayList<String> mShipping_status, ArrayList<String> mCustomer_name, ArrayList<String> mTotal_pay) {
        this.context = context;
        this.storeId = storeId;
        this.userId = userId;
        this.mOrder_id = mOrder_id;
        this.mBill_num = mBill_num;
        this.mBill_createAt = mBill_createAt;
        this.mOrder_status = mOrder_status;
        this.mPayment_status = mPayment_status;
        this.mShipping_status = mShipping_status;
        this.mCustomer_name = mCustomer_name;
        this.mTotal_pay = mTotal_pay;
    }


    @Override
    public OrderRvAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bill,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(OrderRvAdapter.ViewHolder holder, int position) {
        holder.tv_Bill_num.setText(mBill_num.get(position));
        holder.tv_Bill_createAt.setText(mBill_createAt.get(position));
        holder.tv_Order_status.setText(mOrder_status.get(position));
        holder.tv_Pay_status.setText(mPayment_status.get(position));
        holder.tv_Shipping_status.setText(mShipping_status.get(position));
        holder.tv_Total_pay.setText(mTotal_pay.get(position));
        holder.tv_customer_name.setText(mCustomer_name.get(position));


    }

    @Override
    public int getItemCount() {
        return mBill_num.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_Bill_num;
        TextView tv_Bill_createAt;
        TextView tv_Order_status;
        TextView tv_Pay_status;
        TextView tv_Shipping_status;
        TextView tv_Total_pay;
        TextView tv_customer_name;



        public ViewHolder(View itemView) {
            super(itemView);
            tv_Bill_num = itemView.findViewById(R.id.bill_num);
            tv_Bill_createAt = itemView.findViewById(R.id.bill_createAt);
            tv_Order_status = itemView.findViewById(R.id.order_status);
            tv_Pay_status = itemView.findViewById(R.id.pay_status);
            tv_Shipping_status = itemView.findViewById(R.id.shipping_status);
            tv_Total_pay = itemView.findViewById(R.id.totalPay);
            tv_customer_name = itemView.findViewById(R.id.customer_name);

            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            Utils.start_valActivity(context,OrderDetailActivity.class,"orderId",mOrder_id.get(getAdapterPosition()));
            Utils.putValue(context,"orderId",mOrder_id.get(getAdapterPosition()));
            Utils.putValue(context,"storeId",storeId);
            Utils.putValue(context,"userId",userId);






        }
    }
}
