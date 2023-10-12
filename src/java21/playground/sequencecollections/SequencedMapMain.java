package java21.playground.sequencecollections;

import java.util.LinkedHashMap;

/**
 * Class that is used to "play" with the new {@link java.util.SequencedMap} methods.
 */
public class SequencedMapMain {

    public static void main(String[] args) {

        System.out.println("Adding values...");

        var sequenceMap = new LinkedHashMap<>();
        sequenceMap.put("second", "second");
        sequenceMap.putFirst("first", "first");
        sequenceMap.putLast("third", "third");

        System.out.println("Map:");
        System.out.println(sequenceMap);
        System.out.println();

        System.out.println("Map (reversed):");
        System.out.println(sequenceMap.reversed());
        System.out.println();

        System.out.println("Removing first and last values...");
        System.out.println(sequenceMap.sequencedValues());
        System.out.println(sequenceMap.sequencedKeySet());
        System.out.println(sequenceMap.sequencedEntrySet());

        System.out.println("Removing first and last values...");
        System.out.println(sequenceMap.firstEntry());
        System.out.println(sequenceMap.lastEntry());


        System.out.println("Removing first and last values...");
        System.out.println(sequenceMap.pollFirstEntry());
        System.out.println(sequenceMap.pollLastEntry());

        System.out.println("Removing first and last values...");
        System.out.println(sequenceMap);

    }

}
