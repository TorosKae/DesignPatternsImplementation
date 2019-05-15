package test.java;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.barinov.prototype.ItemBasic;
import ru.barinov.prototype.ItemPrototype;


class ItemBasicTest extends ItemPrototype {
    private ItemBasic itemBasic;
    private ItemBasic[] itemBasics = new ItemBasic[3];


    @BeforeEach
    void setUp() {
        itemBasics[0] = new ItemBasic();
        itemBasics[1] = new ItemBasic();
        itemBasics[2] = new ItemBasic();
    }


    @Test
    void getWeight1() {
    float actual = 56;
    float expect = 56;
        assertEquals(expect,actual);
    }

    @Test
    void setWeight1() {
    }

    @Test
    void getName1() {
    }

    @Test
    void setName1() {
    }

    @Test
    void getProducer1() {
    }

    @Test
    void setProducer1() {
    }

    @Test
    void equals1() {
    }

    @Test
    void hashCode1() {
    }

    @Test
    void clone1() {
    }

    @Override
    public ItemPrototype clone() {
        return this;
    }
}