package com.jrd.sixth_chapter.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 2016-07-07.
 */
public class Stack<E> {
    private List<E> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() throws Exception {
        if (this.stack.size() == 0) {
            throw new Exception("Stos jest pusty.");
        } else {
            E element = stack.get(stack.size() - 1);
            stack.remove(element);
            return element;
        }
    }
}
