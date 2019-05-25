package ru.barinov.prototype;

/**
 * food has an extra attributes bgd
 * is protein
 * fat
 * carbs
 */
public class ItemFood extends ItemPrototype {

    private String bgd = "0;0;0";

    public String getBgd() {
        return bgd;
    }

    public void setBgd(String bgd) {
        this.bgd = bgd;
    }

    public ItemFood() {
        this.setType("food");
    }

    public ItemFood(float weight, String name, String producer, String
            group, String bgd) {
        super(weight, name, producer, group);
        this.setType("food");
        this.setBgd(bgd);
    }

    private ItemFood(ItemFood target) {
        super(target);
        if (target != null) {
            this.bgd = target.bgd;
        }
    }

    @Override
    public ItemPrototype clone() {
        return new ItemFood(this);
    }

    @Override
    public String toString() {
        return "type " + this.getType()
                + " name " + this.getName()
                + " weight " + this.getWeight()
                + " producer " + this.getProducer()
                + " bgd " + this.getBgd();
    }
}
