package com.doxpl.testclasses;

import com.doxpl.Person;
import com.doxpl.interfaces.ElementExistsTest;

import java.util.Collection;
import java.util.Iterator;

public class CollectionElementExistsTest implements ElementExistsTest {
    private long startTime;
    private long stopTime;


    @Override
    public long performElementExistsTest(Collection collection, int elementID) {
        startTime = System.currentTimeMillis();

        for (Iterator<Person> it = collection.iterator(); it.hasNext();) {
            Person currentPerson = it.next();
            if(currentPerson.getId() == elementID)
                break;
        }

        stopTime = System.currentTimeMillis();
        return (stopTime - startTime);
    }
}
