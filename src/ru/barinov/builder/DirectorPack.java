package ru.barinov.builder;

public class DirectorPack {
    /**
     * we go without tent and food
     * @param builder
     */
    private final int uncountableItems = 100;
    public void constructHikingPack(IBuilderPack builder){
        builder.choosePack(2000,1);
        builder.getAllClothes(300,uncountableItems);
        builder.getAllStuff(0,uncountableItems);
    }
    /**
     * we go without food
     * @param builder
     */
    public void constructTekkingPack(IBuilderPack builder){
        builder.choosePack(2000,1);
        builder.getAllBivouac(2000,uncountableItems);
        builder.getAllClothes(0,uncountableItems);
        builder.getAllStuff(0,uncountableItems);
    }
    /**
     * we will take all of sets
     * @param builder
     */
    public void constructBackpackingPack(IBuilderPack builder){
        builder.choosePack(3000,1);
        builder.getAllBivouac(2000,uncountableItems);
        builder.getAllClothes(0,uncountableItems);
        builder.getAllStuff(0,uncountableItems);
        builder.getALLFood(1000,uncountableItems);
    }
}
