package model;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {
    private Order incompleted;
    private Order completed;
    private Combo expectedComboA = Combo.A;
    private Combo expectedComboB = Combo.A;

    @BeforeEach
    public void setUp() {
        incompleted = new Order(1, "One", expectedComboA, "");
        completed = new Order(2, "Two", expectedComboB, "Extra");
        completed.setState(State.COMPLETE);
    }

    @Test
    void getRecipe() {
        assertEquals(
                "\nCombo:\tSoup\n" +
                        "Extras:\tExtra\n" +
                        "Price:\t3.5",
                completed.getRecipe());
    }

    @Test
    void getKitchenTask() {
        assertEquals(
                "\nClient:\tTwo\n" +
                        "Combo:\tSoup\n" +
                        "Extras:\tExtra",
                completed.getKitchenTask());
    }

    @Test
    void getInfoComplete() {
        assertEquals(
                "Order#:\t2\n" +
                        "State:\tCOMPLETE\n" +
                        "Combo:\tSoup\n" +
                        "Extras:\tExtra\n" +
                        "Price:\t3.5",
                completed.getInfo());
    }

    @Test
    void getInfoIncomplete() {
        assertEquals(
                "Order#:\t1\n" +
                        "State:\tINCOMPLETE\n" +
                        "Client:\tOne\n" +
                        "Combo:\tSoup\n" +
                        "Extras:\t",
                incompleted.getInfo());
    }
}