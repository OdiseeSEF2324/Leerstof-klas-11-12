package intlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedIntListTest {

    SortedIntList list;

    private void addAllValues(){
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);
    }

    @BeforeEach
    public void setup(){
        list = new SortedIntList();
    }

    // Tests zelfde als gewone IntList
    @Test
    void findMin_WithoutAddedValues_ReturnsNull() {
        // Act
        final Integer min = list.findMin();
        // Assert
        assertNull(min);
    }

    @Test
    void findMin_WithAddedValues_ReturnsLowest1() {
        // Arrange
        addAllValues();
        // Act
        final Integer min = list.findMin();
        // Assert
        assertEquals(1, min);
    }

    //Andere functionaliteit
    //getallen worden gesorteerd bijgehouden
    @Test
    void remove_WithValuesAdded_AllSortedValuesReturnedInOrder() {
        // Arrange
        addAllValues();
        // Act
        // Assert
        assertEquals(1,list.remove(0));
        assertEquals(2,list.remove(0));
        assertEquals(5,list.remove(0));
        assertEquals(8,list.remove(0));
        assertNull(list.remove(0)); // Are there no Integers left behind?
    }

}