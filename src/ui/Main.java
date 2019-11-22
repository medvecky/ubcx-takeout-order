package ui;

import model.Combo;
import model.Order;
import model.State;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "One", Combo.A, ""));
        orders.add(new Order(2, "Two", Combo.B, "Without spices"));
        orders.add(new Order(3, "Three", Combo.C, ""));
        orders.add(new Order(4, "Four", Combo.D, "Extra sausage"));

        printOrders(orders);

        orders.get(1).setState(State.COMPLETE);
        orders.get(3).setState(State.COMPLETE);

        printOrders(orders);
    }

    private static void printOrders(List<Order> orders) {
        orders.forEach(order -> {
            order.printInfo();
            System.out.println("#######################");
            System.out.println();
        });
    }
}
