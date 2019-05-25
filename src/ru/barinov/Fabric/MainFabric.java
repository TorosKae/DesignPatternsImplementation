package ru.barinov.Fabric;

import ru.barinov.builder.BuilderPackMan;
import ru.barinov.builder.BuilderPackWoman;
import ru.barinov.builder.DirectorPack;
import ru.barinov.builder.Pack;
import ru.barinov.prototype.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) making Fabric abstract class made us
 *      override creation method in concrete fabrics
 * 2) in FabricItem class could make
 *    a default constructor
 */
public class MainFabric {

    public static void main(String[] args) {
        List<ItemPrototype> repository = new ArrayList<>();
        ItemBasicCreator itemBasicCreator = new ItemBasicCreator();
        ItemClothesCreator itemClothesCreator = new ItemClothesCreator();
        ItemFoodCreator itemFoodCreator = new ItemFoodCreator();
        ItemPackCreator itemPackCreator = new ItemPackCreator();

        repository.add(itemPackCreator.createItem(3000,"aircontact pro","deuter","woman",80));
        repository.add(itemBasicCreator.createItem(2000,"tent","big agnes","unisex,bivouac"));
        repository.add(itemBasicCreator.createItem(50,"torch","china","unisex,basic"));
        repository.add(itemClothesCreator.createItem(300,"coat","turkey","woman","red"));
        repository.add(itemFoodCreator.createItem(200,"sublime potato","usa","unisex","10:10:10"));

        for (ItemPrototype x: repository
             ) {
            System.out.println(x.toString());
        }


    }
}
