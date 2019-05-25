package ru.barinov.prototype;

/**
 * all clothes here
 *
 */
public class ItemClothes extends ItemPrototype{

    private String color;

    public String getColor() {
        return color;
    }

    /**
     * @param color identify the color of suite
     */
    public void setColor(String color) {
        this.color = color;
    }

    public ItemClothes() {
        this.setType("clothes");
    }
    public ItemClothes(float weight, String name, String producer, String
            group, String color) {
        super(weight,name,producer,group);
        this.setType("clothes");
        this.setColor(color);
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
    @Override
    public String toString() {
        return "type " + this.getType()
                + " name " + this.getName()
                + " weight " + this.getWeight()
                + " producer " + this.getProducer()
                + " color " + this.getColor();
    }
}
