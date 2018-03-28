package guzzu.ian.guzzudemo.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Ian on 2018/2/9 0009.
 */

public class JumpTextUtil implements TextWatcher {
    private EditText mThisView = null;
    private View mNextView = null;

    public JumpTextUtil(EditText mThisView, View mNextView) {
        super();
        this.mThisView = mThisView;
        if (mNextView!=null) {
            this.mNextView = mNextView;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        String str = editable.toString();
        if (str.contains("\r")||str.contains("\n")){
            mThisView.setText(str.replace("\r","").replace("\n",""));
            if (mNextView!=null){
                mNextView.requestFocus();
                if (mNextView instanceof EditText){
                    EditText et = (EditText) mNextView;
                    et.setSelection(et.getText().length());
                }
            }
        }

    }
}
