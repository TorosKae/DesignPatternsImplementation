package ru.barinov.Fabric;

import ru.barinov.prototype.ItemFood;

public class ItemFoodCreator extends FabricItem {
    @Override
    public ItemFood createItem() {
        return new ItemFood();
    }
    public ItemFood createItem(float weight, String name, String producer, String
            group, String bgd){
        return new ItemFood(weight, name, producer, group, bgd);
    }
}
