package com.doxpl.testclasses;

import com.doxpl.Generator;
import com.doxpl.Person;
import com.doxpl.interfaces.BrowsingTest;
import com.doxpl.interfaces.PopulationTest;

import java.util.Collection;
import java.util.Iterator;

public class CollectionBrowsingTest implements BrowsingTest {
    private long startTime;
    private long stopTime;


    @Override
    public long performBrowsingTest(Collection collection) {
        startTime = System.currentTimeMillis();

        for (Iterator<Person> it = collection.iterator(); it.hasNext();) {
            Person currentPerson = it.next();
            //currentPerson;
        }

        stopTime = System.currentTimeMillis();
        return (stopTime - startTime);
    }
}
