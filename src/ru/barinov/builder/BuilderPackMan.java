package ru.barinov.builder;

import ru.barinov.prototype.ItemPrototype;

import java.util.ArrayList;
import java.util.List;

public class BuilderPackMan implements IBuilderPack{
    private List<ItemPrototype> items;
    private static final String manGroup = "man";
    private void findStuffByGroup (String type,float maxWeight, int maxItemAmount){
        int itemAmount = 0;
        //MainBuilder.repository is temporary point of all Data
        for (ItemPrototype item:MainBuilder.repository
        ) {
            if ((item.getGroup().lastIndexOf(manGroup)>=0
                    || item.getGroup().lastIndexOf("unisex")>=0)
                    && item.getType().equals(type)
                    && (maxWeight == 0||item.getWeight() <= maxWeight)){
                items.add(item);
                itemAmount ++;
                if (itemAmount == maxItemAmount) break;
            }
        }
    }

    @Override
    public void choosePack(float maxWeight,int maxItemAmount) {
        items = new ArrayList<>();
        findStuffByGroup("pack",maxWeight,maxItemAmount);
    }

    @Override
    public void getAllStuff(float maxWeight,int maxItemAmount) {
        findStuffByGroup("basic",maxWeight,maxItemAmount);
    }

    @Override
    public void getAllBivouac(float maxWeight,int maxItemAmount) {
        findStuffByGroup("bivouac",maxWeight,maxItemAmount);
    }

    @Override
    public void getAllClothes(float maxWeight,int maxItemAmount) {
        findStuffByGroup("clothes",maxWeight,maxItemAmount);
    }

    @Override
    public void getALLFood(float maxWeight,int maxItemAmount) {
        findStuffByGroup("food",maxWeight,maxItemAmount);
    }

    Pack getResult(){
        return new Pack(items);
    }
}
