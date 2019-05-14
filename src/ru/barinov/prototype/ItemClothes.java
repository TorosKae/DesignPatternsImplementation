package ru.barinov.prototype;

public class ItemClothes extends ItemPrototype{

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ItemClothes() {
    }

    private ItemClothes(ItemClothes target) {
        super(target);
        if(target != null){
            this.color = target.color;
        }
    }

    @Override
    public ItemPrototype clone() {
        return new ItemClothes(this);
    }

}
