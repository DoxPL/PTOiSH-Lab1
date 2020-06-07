package com.doxpl;

import com.doxpl.interfaces.BrowsingTest;
import com.doxpl.interfaces.ElementExistsTest;
import com.doxpl.interfaces.PopulationTest;
import com.doxpl.testclasses.CollectionBrowsingTest;
import com.doxpl.testclasses.CollectionElementExistsTest;
import com.doxpl.testclasses.CollectionPopulationTest;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        List<Person> list = new ArrayList<>();
        Queue<Person> queue = new LinkedBlockingQueue<>();

        callPopulationTest(new CollectionPopulationTest(), set, 100000);
        callPopulationTest(new CollectionPopulationTest(), list, 100000);
        callPopulationTest(new CollectionPopulationTest(), queue, 100000);
        System.out.println();
        callElementExistsTest(new CollectionElementExistsTest(), set, 10);
        callElementExistsTest(new CollectionElementExistsTest(), list, 10);
        callElementExistsTest(new CollectionElementExistsTest(), queue, 10);
        System.out.println();
        callBrowsingTest(new CollectionBrowsingTest(), set);
        callBrowsingTest(new CollectionBrowsingTest(), list);
        callBrowsingTest(new CollectionBrowsingTest(), queue);
    }

    public static void callPopulationTest(PopulationTest test, Collection collection, int count) {
        long result = test.performPopulationTest(collection, count);
        System.out.println("Test result: " + result + "ms");
    }

    public static void callElementExistsTest(ElementExistsTest test, Collection collection, int elementID) {
        long result = test.performElementExistsTest(collection, elementID);
        System.out.println("Test result: " + result + "ms");
    }

    public static void callBrowsingTest(BrowsingTest test, Collection collection) {
        long result = test.performBrowsingTest(collection);
        System.out.println("Test result: " + result + "ms");
    }
}
