package guzzu.cnshoppingmall.aa.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import guzzu.cnshoppingmall.aa.R;
import guzzu.cnshoppingmall.aa.bean.BlockBanner;
import guzzu.cnshoppingmall.aa.bean.BlockNavGroup;
import guzzu.cnshoppingmall.aa.bean.BlockProductGroup;
import guzzu.cnshoppingmall.aa.bean.BlockSpacer;
import guzzu.cnshoppingmall.aa.bean.BlockTitle;
import guzzu.cnshoppingmall.aa.bean.Blocks;
import guzzu.cnshoppingmall.aa.viewholder.BannerViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.NavGroupViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.ProductGroupViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.SpacerViewHolder;
import guzzu.cnshoppingmall.aa.viewholder.TitleViewHolder;

public class HomeRvAdapter extends RecyclerView.Adapter{
    private Context mContext;
    private List<Blocks> blocksList;
    /**
     * 横幅广告
     */
    public static final String BANNER = "banner";
    /**
     * 标题
     */
    public static final String TITLE = "subtitle";

    /**
     * 图标组
     */
    public static final String NAVGROUP= "navgroup";

    /**
     * 产品组
     */
    public static final String PRODUCTGROUP = "productgroup";
    /**
     * 空格
     */
    public static final String SPACER = "spacer";

    private final LayoutInflater mLayoutInflater;

    public HomeRvAdapter(Context mContext,List<Blocks> blocksList) {
        this.mContext = mContext;
        this.blocksList = blocksList;
        mLayoutInflater = LayoutInflater.from(mContext);
    }


    @Override
    public int getItemViewType(int position) {
        return blocksList.get(position).getIndex();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Log.e("viewType", "onCreateViewHolder: "+viewType+","+blocksList.size() );
        if (blocksList.get(viewType).getType().equals(BANNER)){
            return new BannerViewHolder(mLayoutInflater.inflate(R.layout.layout_banner,null));
        }
        if (blocksList.get(viewType).getType().equals(NAVGROUP)){
            return new NavGroupViewHolder(mLayoutInflater.inflate(R.layout.layout_navgroup,null));
        }
        if (blocksList.get(viewType).getType().equals(PRODUCTGROUP)){
            return new ProductGroupViewHolder(mLayoutInflater.inflate(R.layout.layout_productgroup,null));
        }
        if (blocksList.get(viewType).getType().equals(TITLE)){
            return new TitleViewHolder(mLayoutInflater.inflate(R.layout.layout_title,null));
        }
        if (blocksList.get(viewType).getType().equals(SPACER)){
            return new SpacerViewHolder(mLayoutInflater.inflate(R.layout.layout_spacer,null));
        }
       return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (blocksList.get(position).getType().equals(BANNER)){
            if (holder instanceof BannerViewHolder){
                BannerViewHolder bannerViewHolder = (BannerViewHolder) holder;
                List<BlockBanner.Items.Image>imageList = new ArrayList<>();
                for (int i=0;i<blocksList.get(position).getBlockBanner().getItems().size();i++){
                    imageList.add(blocksList.get(position).getBlockBanner().getItems().get(i).getImage());
                    bannerViewHolder.setData(imageList);
            }
            }

        }else if (blocksList.get(position).getType().equals(NAVGROUP)){
            if (holder instanceof NavGroupViewHolder) {
                NavGroupViewHolder navGroupViewHolder = (NavGroupViewHolder) holder;
                List<BlockNavGroup.Items> itemsList;
                String template;
                itemsList = blocksList.get(position).getBlockNavGroup().getItems();
                template = blocksList.get(position).getBlockNavGroup().getTemplate();
                navGroupViewHolder.setData(itemsList, template);
            }
        }else if (blocksList.get(position).getType().equals(PRODUCTGROUP)){
            if (holder instanceof ProductGroupViewHolder) {
                ProductGroupViewHolder productGroupViewHolder = (ProductGroupViewHolder) holder;
                List<BlockProductGroup.Items> itemsList;
                String template;
                itemsList = blocksList.get(position).getBlockProductGroup().getItems();
                template = blocksList.get(position).getBlockProductGroup().getTemplate();
                productGroupViewHolder.setData(itemsList, template);
            }
        }else if (blocksList.get(position).getType().equals(TITLE)){
            if (holder instanceof TitleViewHolder){
                TitleViewHolder titleViewHolder = (TitleViewHolder) holder;
                List<BlockTitle.Items>itemsList;
                String template;
                itemsList = blocksList.get(position).getBlockTitle().getItems();
                template = blocksList.get(position).getBlockTitle().getTemplate();
                titleViewHolder.setData(itemsList,template);
            }
        }else if (blocksList.get(position).getType().equals(SPACER)){
            if (holder instanceof SpacerViewHolder){
                SpacerViewHolder spacerViewHolder = (SpacerViewHolder) holder;
                BlockSpacer blockSpacer;
                blockSpacer = blocksList.get(position).getBlockSpacer();
                spacerViewHolder.setData(blockSpacer);
            }
        }
    }

    @Override
    public int getItemCount() {
        return blocksList.size();
    }

    public void updateData(List<Blocks> blocksList){
        if (blocksList.size()>0){
            this.blocksList = blocksList;
        }
        notifyDataSetChanged();

    }

}
