package com.jrd.sixth_chapter.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kuba on 2016-07-24.
 * Rozwiązanie zadania 25 z rozdziału 6
 */
public class InfoGenerator {
    public static String genericDeclaration(Method m) {
        List<Type> params = Arrays.asList(m.getGenericParameterTypes());

        StringBuilder result = new StringBuilder();
        params.stream().forEach(p -> result.append(p.toString() + ", "));
        return result.toString();
    }
}
