package com.kevin;

public class Ticket {
    int orign;
    int destination;
    int price;

    public Ticket(int orign, int destination, int price) {
        this.orign = orign;
        this.destination = destination;
        this.price = price;
    }

    public Ticket() {
    }

    public int getOrign() {
        return orign;
    }

    public void setOrign(int orign) {
        this.orign = orign;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
