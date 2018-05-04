package guzzu.ian.guzzushoppingmall.bean;

public class Blocks {
    private int index;
    private String type;
    private BlockBanner blockBanner;
    private BlockNavGroup blockNavGroup;
    private BlockTitle blockTitle;
    private BlockProductGroup blockProductGroup;
    private BlockSpacer blockSpacer;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BlockBanner getBlockBanner() {
        return blockBanner;
    }

    public void setBlockBanner(BlockBanner blockBanner) {
        this.blockBanner = blockBanner;
    }

    public BlockNavGroup getBlockNavGroup() {
        return blockNavGroup;
    }

    public void setBlockNavGroup(BlockNavGroup blockNavGroup) {
        this.blockNavGroup = blockNavGroup;
    }

    public BlockTitle getBlockTitle() {
        return blockTitle;
    }

    public void setBlockTitle(BlockTitle blockTitle) {
        this.blockTitle = blockTitle;
    }

    public BlockProductGroup getBlockProductGroup() {
        return blockProductGroup;
    }

    public void setBlockProductGroup(BlockProductGroup blockProductGroup) {
        this.blockProductGroup = blockProductGroup;
    }

    public BlockSpacer getBlockSpacer() {
        return blockSpacer;
    }

    public void setBlockSpacer(BlockSpacer blockSpacer) {
        this.blockSpacer = blockSpacer;
    }
}
