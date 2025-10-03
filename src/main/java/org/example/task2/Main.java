package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Cart cart = new Cart(new Item[10]);
        cart.addToCart(new Item(1, "Samsung Galaxy S23", 27999));
        cart.addToCart(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.addToCart(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.addToCart(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.addToCart(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.addToCart(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.addToCart(new Item(7, "Gorenje Електрична плита", 9999));
        cart.addToCart(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.addToCart(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.addToCart(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // Testing Box class
        Box box = new Box(3.0, 4.0, 5.0);

        System.out.println("\n");
        System.out.println("Площа поверхні: " + box.calcSurfaceArea());
        System.out.println("Площа бічної поверхні: " + box.calcLateralSurfaceArea());
        System.out.println("Об'єм: " + box.calcVolume());


        // Testing IntStack
        IntStack myStack = new IntStack();

        myStack.push(1);
        myStack.push(3);
        myStack.push(40);

        for (int i = 0; i < 7; i++) {
            myStack.push(i);
        }

        myStack.pop();
        myStack.pop();

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

//        myStack.clear();
//        myStack.pop(); throws an exception

        myStack.push(1);
        myStack.push(3);
        myStack.push(40);
        System.out.println("Peek:" + myStack.peek());

        myStack.clear();

        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }
        System.out.println("Size: " + myStack.size());

        System.out.println("Result: Not empty - " + myStack.isEmpty());
        myStack.clear();
        System.out.println("Result: It is empty - " + myStack.isEmpty());

        myStack.clear();
        for (int i = 1; i < 5; i++) {
            myStack.push(i*3);
        }

        myStack.push(10000);
    }
}