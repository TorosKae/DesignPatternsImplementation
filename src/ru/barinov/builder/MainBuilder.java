package ru.barinov.builder;

import ru.barinov.prototype.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) implementations of IBuilderPack interface
 *    define WHAT to build
 *    our products are:
 *    pack ready for travel
 *
 *    implementations define specifications of pack
 *    strong or light
 *    women or man
 * 2) there are several steps for building:
 *      choose the pack
 *      take clothes
 *      take food
 *      take bivouak (tent + sleeping bag)
 *      take other stuff
 * 3) DirectorPack defines HOW to build
 *    Here is sets of stuff (stuff+tent)
 *    for hiking, for trekking
 *    Director supports several products
 *    cause it works with Interface IBuilderPack
 *    have no need to know product of builder
 */
public class MainBuilder {
    public static List<ItemPrototype> repository;
    static ItemBasic newBasicItem(float weight,
            String name,
            String producer,
            String group,
            String type){
        ItemBasic item = new ItemBasic();
        item.setGroup(group);
        item.setName(name);
        item.setProducer(producer);
        item.setWeight(weight);
        item.setType(type);
        return item;
    }
    static ItemClothes newClothesItem(float weight,
                           String name,
                           String producer,
                           String group,
                           String color){
        ItemClothes item = new ItemClothes();
        item.setGroup(group);
        item.setName(name);
        item.setProducer(producer);
        item.setWeight(weight);
        item.setColor(color);
        return item;
    }
    static ItemFood newFoodItem(float weight,
                               String name,
                               String producer,
                               String group,
                               String bgd){
        ItemFood item = new ItemFood();
        item.setGroup(group);
        item.setName(name);
        item.setProducer(producer);
        item.setWeight(weight);
        item.setBgd(bgd);
        return item;
    }
    static ItemPack newPackItem(float weight,
                               String name,
                               String producer,
                               String group,
                               int volume){
        ItemPack item = new ItemPack();
        item.setGroup(group);
        item.setName(name);
        item.setProducer(producer);
        item.setWeight(weight);
        item.setVolume(volume);
        return item;
    }
    public static void main(String[] args) {
        repository = new ArrayList<>();
        //stuff for woman
        repository.add(newPackItem(1000,"eva","osprey","woman",50));
        repository.add(newPackItem(3000,"aircontact pro","deuter","woman",80));
        repository.add(newBasicItem(2000,"tent","big agnes","unisex","bivouac"));
        repository.add(newBasicItem(3000,"tent heavy","nordway","unisex","bivouac"));
        repository.add(newBasicItem(50,"torch","china","unisex","basic"));
        repository.add(newClothesItem(300,"coat","turkey","woman","red"));
        repository.add(newFoodItem(200,"sublime potato","usa","unisex","10:10:10"));
        BuilderPackWoman builderWoman = new BuilderPackWoman();
        DirectorPack directorPack = new DirectorPack();
        directorPack.constructHikingPack(builderWoman);
        Pack pack = builderWoman.getResult();
        System.out.println(pack.toString()+" : "+pack.getAllItems().size());
        for (ItemPrototype pc:pack.getAllItems()) {
            System.out.println(pc.toString());
        }
        directorPack.constructBackpackingPack(builderWoman);
        pack = builderWoman.getResult();
        System.out.println(pack.toString()+" : "+pack.getAllItems().size());
        for (ItemPrototype pc:pack.getAllItems()) {
            System.out.println(pc.toString());
        }

        repository.add(newPackItem(1200,"exos","osprey","man",50));
        repository.add(newPackItem(3600,"aircontact pro man","deuter","man",80));
        repository.add(newBasicItem(2000,"tent","big agnes","unisex","bivouac"));
        repository.add(newBasicItem(3000,"tent heavy","nordway","unisex","bivouac"));
        repository.add(newBasicItem(50,"torch 2","china","unisex","basic"));
        repository.add(newClothesItem(350,"coat man","turkey","man","red"));
        repository.add(newFoodItem(100,"sublime tomato","usa","unisex","10:10:10"));
        BuilderPackMan builderMan = new BuilderPackMan();
        directorPack.constructBackpackingPack(builderMan);
        pack = builderWoman.getResult();
        System.out.println(pack.toString()+" : "+pack.getAllItems().size());
        for (ItemPrototype pc:pack.getAllItems()) {
            System.out.println(pc.toString());
        }
    }
}
