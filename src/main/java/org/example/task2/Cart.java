package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] itemList;
    private int itemIndexInList;

    public Cart(Item[] item) {
        this.itemList = item;
    }

    public int getItemIndexInList() {
        return this.itemIndexInList;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public void removeById(int itemIndex) {
        if (this.itemIndexInList == 0) return;

        int foundItemIndex = this.findItemInArray(this.itemList[itemIndex]);

        if (foundItemIndex == -1) return;

        if (foundItemIndex == this.itemIndexInList - 1) {
            this.itemList[this.itemIndexInList - 1] = null;
            this.itemIndexInList--;
            return;
        }

        this.shiftArray(foundItemIndex);
    }

    public void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < this.itemIndexInList - 1; i++) {
            this.itemList[i] = this.itemList[i + 1];
        }
        this.itemList[this.itemIndexInList -1] = null;
        this.itemIndexInList--;
    }

    public int findItemInArray(Item item) {
        for (int i = 0; i < this.itemIndexInList; i++) {
            if (this.itemList[i].getId() == item.getId()) {
                return i;
            }
        }
        return -1;
    }

    public void addToCart(Item item) {
        if (isCartFull()) return;

        this.itemList[this.itemIndexInList] = item;
        this.itemIndexInList++;
    }

    public boolean isCartFull() {
        return itemIndexInList == this.itemList.length;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(this.itemList) +
                '}' + "\n";
    }
}
