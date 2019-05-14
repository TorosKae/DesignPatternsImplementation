package ru.barinov.prototype;

import java.util.Objects;

/**
 * Class represents some abstract items
 * from the backpack
 * it has basic attributes
 * and should clone itself
 */

public abstract class ItemPrototype implements  Cloneable {
    private float weight;
    private String name;
    private String producer;

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

    protected ItemPrototype() {
    }

    protected ItemPrototype(ItemPrototype target) {
        //basic attributes clone
        if (target != null) {
            this.weight = target.weight;
            this.name = target.name;
            this.producer = target.producer;
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
