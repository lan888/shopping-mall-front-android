package guzzu.cnshoppingmall.aa.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import guzzu.cnshoppingmall.baselibrary.util.Utils;
import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.BlockSpacer;

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
