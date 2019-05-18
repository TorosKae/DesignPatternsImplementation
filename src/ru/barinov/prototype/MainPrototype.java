package ru.barinov.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        List<ItemPrototype> items = new ArrayList<>();
        items.add(new ItemBasic());
        ItemBasic item = (ItemBasic) items.get(0);
        item.setName("gas boiler");
        item.setProducer("china");
        item.setWeight(50);
        items.add(item.clone());
        item = (ItemBasic) items.get(1);
        item.setProducer("USA");
        items.add(new ItemClothes());
        ItemClothes cloth = (ItemClothes) items.get(2);
        cloth.setProducer("USA");
        cloth.setColor("red");
        cloth.setName("coat");
        cloth.setWeight(300);
        items.add(new ItemPack());
        ItemPack pack = (ItemPack) items.get(3);
        pack.setVolume(80);
        pack.setName("big pack");
        pack.setProducer("Deuter");
        pack.setWeight(3.6f);
        items.add(pack.clone());
        pack = (ItemPack) items.get(4);
        pack.setName("light pack");
        pack.setVolume(50);
        pack.setProducer("Osprey");
        pack.setWeight(1.2f);
        for (ItemPrototype itemPrototype:items
             ) {
            System.out.println(itemPrototype.toString());
        }
    }
}
