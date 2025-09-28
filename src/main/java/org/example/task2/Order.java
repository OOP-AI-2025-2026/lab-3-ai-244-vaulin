package org.example.task2;

public class Order {

    public long id;
    public String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id).append(" for customer ").append(customer);
        builder.append("\n------------------\n");

        double sum = 0.0;
        Item[] contents = cart.getItemList();

        for (int i = 0; i < cart.getItemIndexInList(); i++) {

            sum += contents[i].getPrice();

            builder.append("Item id: ");
            builder.append(contents[i].getId());
            builder.append(" name: ");
            builder.append(contents[i].getName());
            builder.append(" price: ");
            builder.append(contents[i].getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(sum);


        return builder.toString();
    }
}
