package ru.barinov.builder;

import ru.barinov.prototype.ItemPrototype;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private List<ItemPrototype> items;

    Pack(List<ItemPrototype> items){
        packInitialize();
        this.items = items;
    }
    private void packInitialize(){
        this.items = new ArrayList<>();
    }
    void addItem(ItemPrototype item){
        this.items.add(item);
    }

    public List<ItemPrototype> getAllItems(){
        return items;
    }
}
