package com.jrd.sixth_chapter.pair;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Created by Kuba on 2016-07-16.
 *
 * Rozwiązanie zadania 9, 10, 11 i 12
 */
public class ArraysTool {

    @SuppressWarnings("unchecked")
    public static <E extends Comparable<E>> Pair<E> pierwszyOstatni(List<E> a) {
        E max = a.stream().max(Comparable::compareTo).get();
        E min = a.stream().min(Comparable::compareTo).get();

        Pair<E> result = new Pair<>(min, max);
        return result;
    }

    public static <T extends Comparable<T>> T min(T[] a) {
        return Arrays.asList(a).stream().min(Comparable::compareTo).get();
    }

    public static <T extends Comparable<T>> T max(T[] a) {
        return Arrays.asList(a).stream().max(Comparable::compareTo).get();
    }

    public static <T extends Comparable<T>> Pair<T> minMax(T[] a) {
        T min = min(a);
        T max = max(a);

        return new Pair<>(min, max);
    }

    public static <T> void minmax(List<T> elementy, Comparator<? super T> comp, List<? super T> wynik) {
        T max = elementy.stream().max(comp::compare).get();
        T min = elementy.stream().min(comp::compare).get();
        wynik.add(min);
        wynik.add(max);
    }

    public static <T, R> ArrayList<R> map(ArrayList<T> a, Function<T, R> func) {
        final ArrayList<R> result = new ArrayList<R>();
        a.forEach(e -> result.add(func.apply(e)));
        return result;
    }

    public static <T> T[] powtarzaj(int n, T obj, IntFunction<T[]> constr) {
        T[] wynik = constr.apply(n);
        for (int i = 0; i < n; i++) {
            wynik[i] = obj;
        }

        return wynik;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static final <T> T[] repeat(int n, T... objs) {
        int oldSize = java.lang.reflect.Array.getLength(objs);
        int newSize = oldSize * n;

        T[] newArray = (T[])java.lang.reflect.Array.newInstance(objs.getClass().getComponentType(), newSize);
        for (int i = 0; i < newSize; i++) {
            newArray[i] = objs[i % oldSize];
        }

        return newArray;
    }

    @SafeVarargs
    @SuppressWarnings("unchecked")
    public static <T> T[] createArray(int size, T... objs) {
        T[] newArray = (T[])java.lang.reflect.Array.newInstance(objs.getClass().getComponentType(), size);
        return newArray;
    }

    // TODO: fix this!!!
    public static <V, T extends Throwable> V doWork(Callable<V> c, T exe) throws T, IllegalAccessException, InvocationTargetException, InstantiationException {
        try {
            return c.call();
        } catch (Throwable realEx) {
            exe.initCause(realEx);
            throw exe;
        }
    }
}
