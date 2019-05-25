package ru.barinov.Fabric;

import ru.barinov.prototype.ItemPack;

public class ItemPackCreator extends FabricItem {
    @Override
    public ItemPack createItem() {
        return new ItemPack();
    }

    public ItemPack createItem(float weight, String name, String producer, String
            group, float volume) {
        return new ItemPack(weight, name, producer, group, volume);
    }
}
