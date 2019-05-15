package ru.barinov.prototype;

public class ItemBasic extends ItemPrototype{

    public ItemBasic() {
    }

    private ItemBasic(ItemBasic target) {
        super(target);
    }

    @Override
    public ItemPrototype clone() {
        return new ItemBasic(this);
    }


}