package com.jrd.sixth_chapter.tablestack;


/**
 * Created by Kuba on 2016-07-07.
 * Rozwiązanie zadania 2 z rodziału 6
 *
 * Implementacja uogólnionego stosu za pomocą tablicy jednowymiarowej
 */
public class Stack<E> {
    private E[] stack;

    private int index;

    private final int initSize = 100;

    private int stackSize;

    private Class<E> cl;

    @SuppressWarnings("unchecked")
    public Stack(Class<E> cl) {
        index = 0;
        stackSize = initSize;
        this.cl = cl;
        stack = (E[])java.lang.reflect.Array.newInstance(cl, initSize);
    }

    public void push(E element) {
        if (index == stackSize) {
            extendStack();
        }

        stack[index] = element;
        index++;
    }

    public E pop() throws Exception {
        if (index < 0) {
            throw new Exception("Stos jest pusty.");
        } else {
            index--;
            E element = stack[index];
            return element;
        }
    }

    @SuppressWarnings("unchecked")
    private void extendStack() {
        stackSize += initSize;
        E[] newStack = (E[])java.lang.reflect.Array.newInstance(cl, stackSize);
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}