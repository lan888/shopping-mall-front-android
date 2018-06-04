package cn.guzzu.shoppingmall.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import cn.guzzu.shoppingmall.R;

public class ShoppingCartAmountView extends LinearLayout implements View.OnTouchListener {
    private static final String TAG = "AmountView";
    private int amount = 1; //购买数量
    private int goods_storage = 1; //商品库存

    private OnAmountChangeListener mListener;

    private TextView etAmount;
    private Button btnDecrease;
    private Button btnIncrease;
    private boolean isOnLongClick = true;
    private boolean decEnable = true;
    private boolean incEnable = true;

    public ShoppingCartAmountView(Context context) {
        this(context, null);
    }

    public ShoppingCartAmountView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.view_amount, this);
        etAmount =  findViewById(R.id.etAmount);
        btnDecrease = (Button) findViewById(R.id.btnDecrease);
        btnIncrease = (Button) findViewById(R.id.btnIncrease);
        btnIncrease.setOnTouchListener(this);
        btnDecrease.setOnTouchListener(this);


        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.AmountView);
        int btnWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AmountView_btnWidth, LayoutParams.WRAP_CONTENT);
        int tvWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AmountView_tvWidth, 80);
        int tvTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AmountView_tvTextSize, 0);
        int btnTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AmountView_btnTextSize, 0);
        obtainStyledAttributes.recycle();

        LayoutParams btnParams = new LayoutParams(btnWidth, LayoutParams.MATCH_PARENT);
        btnDecrease.setLayoutParams(btnParams);
        btnIncrease.setLayoutParams(btnParams);
        btnDecrease.setTextColor(getContext().getResources().getColor(R.color.dark_gray_bg));

        if (btnTextSize != 0) {
            btnDecrease.setTextSize(TypedValue.COMPLEX_UNIT_PX, btnTextSize);
            btnIncrease.setTextSize(TypedValue.COMPLEX_UNIT_PX, btnTextSize);
        }

        LayoutParams textParams = new LayoutParams(tvWidth, LayoutParams.MATCH_PARENT);
        etAmount.setLayoutParams(textParams);
        if (tvTextSize != 0) {
            etAmount.setTextSize(tvTextSize);
        }
    }

    public void setOnAmountChangeListener(OnAmountChangeListener onAmountChangeListener) {
        this.mListener = onAmountChangeListener;
    }

    public ShoppingCartAmountView setGoods_storage(int goods_storage) {
        this.goods_storage = goods_storage;
        setBtnEnable();
        return this;
    }

    public ShoppingCartAmountView setAmount(int amount) {
        this.amount = amount;
        etAmount.setText(String.valueOf(amount));
        setBtnEnable();
        if (mListener != null) {
            mListener.onAmountChange(this, amount);
        }
        return this;
    }




    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            switch (v.getId()){
                case R.id.btnDecrease:
                    Thread decThread = new decThread();
                    isOnLongClick = true;
                    decThread.start();

                    break;
                case R.id.btnIncrease:
                    Thread incThread = new plusThread();
                    isOnLongClick = true;
                    incThread.start();
                    break;
            }
        }else if (event.getAction() == MotionEvent.ACTION_UP){
            isOnLongClick = false;
        }

        return true;
    }
    //更新文本框的值
    Handler myHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    if (decEnable) {
                        amount--;
                        etAmount.setText(String.valueOf(amount));
                    }
                    break;
                case 2:
                    if (incEnable) {
                        amount++;
                        etAmount.setText(String.valueOf(amount));
                    }
                    break;
            }
            setBtnEnable();
            if (mListener != null) {
                mListener.onAmountChange(ShoppingCartAmountView.this, amount);
            }
        };
    };
    //超出最大最小值范围按钮的可能与不可用
    private void setBtnEnable() {
        if (goods_storage == 1){
            decEnable = false;
            incEnable = false;
            btnDecrease.setTextColor(getContext().getResources().getColor(R.color.dark_gray_bg));
            btnIncrease.setTextColor(getContext().getResources().getColor(R.color.dark_gray_bg));
            return;
        }
       if (amount<=1){
           decEnable = false;
           incEnable = true;
           btnDecrease.setTextColor(getContext().getResources().getColor(R.color.dark_gray_bg));
           btnIncrease.setTextColor(getContext().getResources().getColor(R.color.md_black_1000));
       }else if (amount>=goods_storage){
           incEnable = false;
           decEnable = true;
           btnIncrease.setTextColor(getContext().getResources().getColor(R.color.dark_gray_bg));
           btnDecrease.setTextColor(getContext().getResources().getColor(R.color.md_black_1000));
       }else {
           decEnable = true;
           incEnable = true;
           btnIncrease.setTextColor(getContext().getResources().getColor(R.color.md_black_1000));
           btnDecrease.setTextColor(getContext().getResources().getColor(R.color.md_black_1000));
       }
        Log.d(TAG, "setBtnEnable: "+amount+","+goods_storage);
    }
    //减操作
    class decThread extends Thread {
        @Override
        public void run() {
            while (isOnLongClick) {
                try {
                    Thread.sleep(200);
                    myHandler.sendEmptyMessage(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        }
    }
    //加操作
    class plusThread extends Thread {
        @Override
        public void run() {
            while (isOnLongClick) {
                try {
                    Thread.sleep(200);
                    myHandler.sendEmptyMessage(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                super.run();
            }
        }
    }

    public interface OnAmountChangeListener {
        void onAmountChange(View view, int amount);
    }
}
