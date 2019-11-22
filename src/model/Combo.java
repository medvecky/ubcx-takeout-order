package model;

public enum Combo {
    A("Soup", 3.50),
    B("Pizza", 5.50),
    C("Burger", 1.00),
    D("Salad", 2.00);

    private final String content;
    private final double price;

    Combo(String content, double price) {
        this.content = content;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }
}
