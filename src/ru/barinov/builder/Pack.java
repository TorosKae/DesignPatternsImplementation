package ru.barinov.builder;

import ru.barinov.prototype.ItemPrototype;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private List<ItemPrototype> items;

    void packInicialize(){
        this.items = new ArrayList<>();
    }
    void addItem(ItemPrototype item){
        this.items.add(item);
    }
}
