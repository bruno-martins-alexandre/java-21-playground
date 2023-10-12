package java21.playground.sequencecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class CollectionsMain {

    public static void main(String[] args) {

        Collections.unmodifiableSequencedCollection(new ArrayList<>());
        Collections.unmodifiableSequencedSet(new LinkedHashSet<>());
        Collections.unmodifiableSequencedMap(new LinkedHashMap<>());

    }
}
