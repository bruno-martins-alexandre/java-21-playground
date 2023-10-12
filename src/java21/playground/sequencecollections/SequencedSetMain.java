package java21.playground.sequencecollections;

import java.util.LinkedHashSet;

/**
 * Class that is used to "play" with the new {@link java.util.SequencedSet} methods.
 */
public class SequencedSetMain {

    public static void main(String[] args) {

        System.out.println("Adding values...");

        var sequenceCollection = new LinkedHashSet<>();
        sequenceCollection.add("second");
        sequenceCollection.addFirst("first");
        sequenceCollection.addLast("third");

        System.out.println("Set:");
        System.out.println(sequenceCollection);
        System.out.println();

        System.out.println("Set (reversed):");
        System.out.println(sequenceCollection.reversed());
        System.out.println();

        System.out.println("Removing first and last values...");
        sequenceCollection.removeFirst();
        sequenceCollection.removeLast();

        System.out.println("Set:");
        System.out.println(sequenceCollection);

    }
}
