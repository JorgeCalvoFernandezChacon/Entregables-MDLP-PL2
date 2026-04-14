package es.uah.matcomp.mp.el2.b.ejercicios_final.ej1.c2.customer;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    // Devuelve la cantidad después del descuento
    public double getAmountAfterDiscount() {
        // Fórmula: cantidad - (cantidad * descuento / 100)
        return amount - (amount * customer.getDiscount() / 100.0);
    }

    public String toString() {
        // Reutiliza el toString de Customer para la parte de customer=...
        return "Invoice[id=" + id +
                ",customer=" + customer.toString() +
                ",amount=" + amount + "]";
    }
}
