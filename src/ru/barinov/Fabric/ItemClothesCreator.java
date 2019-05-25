package ru.barinov.Fabric;

import ru.barinov.prototype.ItemClothes;

public class ItemClothesCreator extends FabricItem {
    @Override
    public ItemClothes createItem() {
        return new ItemClothes();
    }
    public ItemClothes createItem(float weight, String name, String producer, String
            group, String color){
        return new ItemClothes(weight, name, producer, group, color);
    }
}
