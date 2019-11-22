package model;

import static model.State.INCOMPLETE;

public class Order {
    private final int number;
    private final String name;
    private final Combo combo;
    private final String extra;
    private State state;

//    MODIFIES: this
//    EFFECTS: Create new order
    public Order(int number, String name, Combo combo, String extra) {
        this.number = number;
        this.name = name;
        this.combo = combo;
        this.extra = extra;
        this.state = INCOMPLETE;
    }

    public State getState() {
        return state;
    }

//    MODIFIES: this
//    EFFECTS: set state
    public void setState(State state) {
        this.state = state;
    }

    //    EFFECTS: returns String which contains combo name and price
    public String getRecipe() {
        return "\nCombo:\t" + combo.getContent() +
                "\nExtras:\t" + extra +
                "\nPrice:\t" + combo.getPrice();
    }

    //    EFFECTS: returns String contains client info and order info
    public String getKitchenTask() {
        return "\nClient:\t" + name +
                "\nCombo:\t" + combo.getContent() +
                "\nExtras:\t" + extra;
    }

    //   EFFECTS: returns state and depending on state task or recipe
    public String getInfo() {
        String result = "Order#:\t" + number +
                "\nState:\t" + state;
        if (state == INCOMPLETE) {
            return result + getKitchenTask();
        } else {
            return result + getRecipe();
        }
    }

    public void printInfo() {
        System.out.println(getInfo());
    }

}
