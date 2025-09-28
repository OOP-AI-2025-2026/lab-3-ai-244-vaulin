package org.example.task2;

import java.util.Arrays;

public class Cart {
    private final Item[] itemList;
    private int itemIndex;

    public Cart(Item[] item) {
        this.itemList = item;
    }

    public void removeById(int itemIndex) {
        if (this.itemIndex == 0) return;

        int foundItemIndex = this.findItemInArray(this.itemList[itemIndex]);

        if (foundItemIndex == -1) return;

        if (foundItemIndex == this.itemIndex - 1) {
            this.itemList[this.itemIndex - 1] = null;
            this.itemIndex--;
            return;
        }

        this.shiftArray(foundItemIndex);
    }

    public void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.itemIndex - 1; i++) {
            this.itemList[i] = this.itemList[i + 1];
        }
        this.itemList[this.itemIndex -1] = null;
        this.itemIndex--;
    }

    public int findItemInArray(Item item) {
        for (int i = 0; i < this.itemIndex; i++) {
            if (this.itemList[i].getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }

    public void addToCart(Item item) {
        if (isCartFull()) return;

        this.itemList[this.itemIndex] = item;
        this.itemIndex++;
    }

    public boolean isCartFull() {
        return itemIndex == this.itemList.length;
    }

    public int getItemListIndex() {
        return this.itemIndex;
    }

    public Item[] getItemList() {
        return itemList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(this.itemList) +
                '}' + "\n";
    }
}
