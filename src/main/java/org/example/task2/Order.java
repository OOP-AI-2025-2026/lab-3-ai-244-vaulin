package org.example.task2;

public class Order {
    private final long id;
    private final String customerName;

    public Order(long id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ")
                .append(this.id)
                .append(" for customer ")
                .append(this.customerName);
        builder.append("\n------------------\n");

        double totalSumOfItems = 0.0;
        Item[] listOfItemsInCart = cart.getItemList();

        for (int i = 0; i < cart.getItemListIndex(); i++) {

            totalSumOfItems += listOfItemsInCart[i].getPrice();

            builder.append("Item id: ");
            builder.append(listOfItemsInCart[i].getId());
            builder.append(" name: ");
            builder.append(listOfItemsInCart[i].getName());
            builder.append(" price: ");
            builder.append(listOfItemsInCart[i].getPrice());
            builder.append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ");
        builder.append(totalSumOfItems);

        return builder.toString();
    }
}
