package com.doxpl.testclasses;

import com.doxpl.Generator;
import com.doxpl.interfaces.PopulationTest;
import java.util.Collection;

public class CollectionPopulationTest implements PopulationTest {
    private long startTime;
    private long stopTime;

    @Override
    public long performPopulationTest(Collection collection, int count) {
        startTime = System.currentTimeMillis();

        for(int i = 0; i < count; i++)
        {
            collection.add(Generator.generatePerson());
        }

        stopTime = System.currentTimeMillis();
        return (stopTime - startTime);
    }
}
