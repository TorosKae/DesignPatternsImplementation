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
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    ItemPrototype() {
    }
    public ItemPrototype(float weight, String name, String producer, String
            group) {
        this.setWeight(weight);
        this.setName(name);
        this.setProducer(producer);
        this.setGroup(group);
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
