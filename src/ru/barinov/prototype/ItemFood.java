package ru.barinov.prototype;

public class ItemFood extends ItemPrototype{

    String bgd = "0;0;0";

    public String getBgd() {
        return bgd;
    }

    public void setBgd(String bgd) {
        this.bgd = bgd;
    }

    public ItemFood() {
    }

    private ItemFood(ItemFood target) {
        super(target);
        if(target != null){
            this.bgd = target.bgd;
        }
    }

    @Override
    public ItemPrototype clone() {
        return new ItemFood(this);
    }

}
