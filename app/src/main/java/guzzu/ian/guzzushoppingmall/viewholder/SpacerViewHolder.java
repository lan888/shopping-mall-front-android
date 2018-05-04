package guzzu.ian.guzzushoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import guzzu.ian.baselibrary.util.DataBindingViewUtil;
import guzzu.ian.baselibrary.util.Utils;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.BlockSpacer;
import guzzu.ian.guzzushoppingmall.bean.BlockTitle;

public class SpacerViewHolder extends RecyclerView.ViewHolder {
    private View spacer;
    public SpacerViewHolder(View itemView) {
        super(itemView);
        spacer = itemView.findViewById(R.id.spacer);
    }

    public void setData(final BlockSpacer spacer_info){
        ViewGroup.LayoutParams lp = spacer.getLayoutParams();
        lp.height = Utils.dp2px(itemView.getContext(),spacer_info.getHeight());
        spacer.setLayoutParams(lp);


        }

}
