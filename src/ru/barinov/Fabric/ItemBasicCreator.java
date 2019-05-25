package ru.barinov.Fabric;

import ru.barinov.prototype.*;

public class ItemBasicCreator extends FabricItem {
    @Override
    public ItemBasic createItem() {
        return new ItemBasic();
    }
    public ItemBasic createItem(float weight, String name, String producer, String
            group){
        return new ItemBasic(weight, name, producer, group);
    }
}
