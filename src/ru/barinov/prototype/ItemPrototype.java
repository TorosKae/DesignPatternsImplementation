package ru.barinov.prototype;

import java.util.Objects;

/**
 * Class represents some abstract items
 * from the backpack
 * it has basic attributes
 * and could clone itself
 * you could clone an object
 * and ain't gonna rewrite repeatable attributes
 * every implementation have it's own specialities
 * f.e. clothes has + color
 */

public abstract class ItemPrototype implements  Cloneable {
    private float weight;
    private String name;
    private String producer;
    private String group;
    String type;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getProducer() {
        return producer;
    }

    void setProducer(String producer) {
        this.producer = producer;
    }

    ItemPrototype() {
    }

    ItemPrototype(ItemPrototype target) {
        //basic attributes clone
        if (target != null) {
            this.weight = target.weight;
            this.name = target.name;
            this.producer = target.producer;
            this.type = target.type;
            this.group = target.group;
        }
    }

    public abstract ItemPrototype clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ItemPrototype)) return false;
        ItemPrototype item2 = (ItemPrototype) object2;
        return Objects.equals(item2.weight, weight);
    }
    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }
}
