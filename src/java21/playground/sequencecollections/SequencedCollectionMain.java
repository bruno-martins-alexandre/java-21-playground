package java21.playground.sequencecollections;

import java.util.ArrayList;

/**
 * Class that is used to "play" with the new {@link java.util.SequencedCollection} methods.
 */
public class SequencedCollectionMain {

    public static void main(String[] args) {

        System.out.println("Adding values...");

        var sequenceCollection = new ArrayList<>();
        sequenceCollection.add("second");
        sequenceCollection.addFirst("first");
        sequenceCollection.addLast("third");

        System.out.println("Collection:");
        System.out.println(sequenceCollection);
        System.out.println();

        System.out.println("Collection (reversed):");
        System.out.println(sequenceCollection.reversed());
        System.out.println();

        System.out.println("Removing first and last values...");
        sequenceCollection.removeFirst();
        sequenceCollection.removeLast();

        System.out.println("Collection:");
        System.out.println(sequenceCollection);

    }

}
