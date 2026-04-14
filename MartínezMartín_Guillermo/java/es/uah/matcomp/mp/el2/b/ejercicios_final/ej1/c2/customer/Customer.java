package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c2.customer;

public class Customer {
    private int id;
    private String name;
    private int discount; // En porcentaje

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getDiscount() { return discount; }
    public void setDiscount(int discount) { this.discount = discount; }

    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
