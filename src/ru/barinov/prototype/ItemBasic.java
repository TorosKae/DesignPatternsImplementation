package ru.barinov.prototype;

/**
 * different stuff
 * trekking poles, sleeping bags and so on
 */
public class ItemBasic extends ItemPrototype {

    public ItemBasic() {
        this.setType("basic");
    }

    public ItemBasic(float weight, String name, String producer, String
            group) {
        super(weight,name,producer,group);
        this.setType("basic");
    }

    private ItemBasic(ItemBasic target) {
        super(target);
    }

    @Override
    public ItemPrototype clone() {
        return new ItemBasic(this);
    }

    @Override
    public String toString() {
        return "type " + this.getType()
                + " name " + this.getName()
                + " weight " + this.getWeight()
                + " producer " + this.getProducer();
    }
}