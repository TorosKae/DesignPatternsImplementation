package ru.barinov.prototype;

public class ItemPack extends ItemPrototype{

    float volume;

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public ItemPack() {
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

}
