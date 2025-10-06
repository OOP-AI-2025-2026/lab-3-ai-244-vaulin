package org.example.task2;

import java.util.Arrays;

public class IntStack {
    private final int FIRST_ID_IN_STACK = 0;

    private int[] stackListOfValues = new int[1];
    private int currentPointerInStack = FIRST_ID_IN_STACK;

    public IntStack() {}

    public void push(int value) {
        if (this.stackListOfValues.length <= this.currentPointerInStack) {
            this.doubleStackSize();
        }
        this.stackListOfValues[this.currentPointerInStack] = value;
        this.currentPointerInStack++;
    }

    public int pop() {
        if (this.currentPointerInStack <= 0) {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }

        this.stackListOfValues[this.currentPointerInStack -1] = 0;
        this.currentPointerInStack--;

        return this.stackListOfValues[this.currentPointerInStack];
    }

    public void clear() {
        Arrays.fill(this.stackListOfValues, 0);
        this.currentPointerInStack = FIRST_ID_IN_STACK;
    }

    public int peek() {
        if (this.currentPointerInStack == 0) {
            throw new IndexOutOfBoundsException("Stack is empty!");
        }
        return stackListOfValues[this.currentPointerInStack - 1];
    }

    public int size() {
        return currentPointerInStack;
    }

    public boolean isEmpty() {
        return this.currentPointerInStack == 0;
    }

    private void doubleStackSize() {
        int doubleStackSize = 2;
        int[] newStack = new int[stackListOfValues.length * doubleStackSize];

        System.arraycopy(stackListOfValues, 0, newStack, 0, stackListOfValues.length);
        this.stackListOfValues = newStack;
    }
}
