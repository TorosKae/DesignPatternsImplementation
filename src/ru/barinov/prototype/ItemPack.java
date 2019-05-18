package ru.barinov.prototype;

/**
 * packs is a stuff itself
 * and uses to collect other carry other items
 * ans itself
 */
public class ItemPack extends ItemPrototype{

    private float volume;

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public ItemPack() {
        this.type = "pack";
    }

    private ItemPack(ItemPack target) {
        super(target);
        if(target != null){
            this.volume = target.volume;
        }
    }

    @Override
    public ItemPrototype clone() {
        return new ItemPack(this);
    }
    @Override
    public String toString() {
        return "type " + this.type
                + " name " + this.getName()
                + " weight " + this.getWeight()
                + " producer " + this.getProducer()
                + " volume " + this.getVolume();
    }
}
