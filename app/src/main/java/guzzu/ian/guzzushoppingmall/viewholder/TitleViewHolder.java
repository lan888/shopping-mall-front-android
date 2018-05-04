package guzzu.ian.guzzushoppingmall.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import guzzu.ian.baselibrary.util.DataBindingViewUtil;
import guzzu.ian.guzzushoppingmall.R;
import guzzu.ian.guzzushoppingmall.bean.BlockProductGroup;
import guzzu.ian.guzzushoppingmall.bean.BlockTitle;

public class TitleViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView subtitle;
    private LinearLayout linearLayout;
    public TitleViewHolder(View itemView) {
        super(itemView);
        linearLayout = itemView.findViewById(R.id.layout_title);
    }

    public void setData(final List<BlockTitle.Items> title_info, final String template){
        DataBindingViewUtil.bindDataToLayout(title_info, linearLayout, R.layout.layout_title_item, new DataBindingViewUtil.OnBindingDataWithLayoutParamsListener<BlockTitle.Items>() {
            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v) {
                return null;
            }

            @Override
            public ViewGroup.LayoutParams onCreateLayoutParams(View v, int position) {
                return null;
            }

            @Override
            public void onBindData(@NonNull View v, BlockTitle.Items data, int position) {
                title = v.findViewById(R.id.bigTitle);
                subtitle = v.findViewById(R.id.subtitle);
                title.setText(data.getTitle());
                subtitle.setText(data.getSubtitle());

            }
        });

    }
}
