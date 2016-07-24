package com.jrd.sixth_chapter.reflection;


import org.junit.Test;

import java.util.Arrays;


/**
 * Created by Kuba on 2016-07-24.
 */
public class InfoGeneratorTest {

    @Test
    public void genericDeclarationTest() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clazz = Class.forName("com.jrd.sixth_chapter.pair.ArraysTool");

        Arrays.stream(clazz.getMethods())
                .forEach(m -> System.out.println(InfoGenerator.genericDeclaration(m)));
    }
}
