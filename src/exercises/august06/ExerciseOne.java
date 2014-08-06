package exercises.august06;

import exercises.august06.exercise1.Fish;
import exercises.august06.exercise1.FishingRegulator;
import exercises.august06.exercise1.StripedBass;

import java.util.HashSet;
import java.util.Set;

/**
 * Create an ArrayList of floats called fishLengthList. This list will represent
 * the sizes of a few striped bass.
 * Ass the following floats to the list: 10.0, 15.5, 18.0, 29.5, 45.5. These numbers
 * represent the length in inches of the bass.
 * Iterate through the list, printing out only the numbers larger than the required length.
 * Assume the required length is 28 inches.
 *
 * If you've been following my work, you should realise that I prefer to do these things a
 * little more correctly. I'll leave this one without a full analysis, see if you can work
 * out why I'm doing what I'm doing.
 *
 * As a bonus, try to figure out why the output isn't in the same order for both regulators.
 * If it is in order, recompile, you just got lucky.
 */
public class ExerciseOne {

    public static void main(String[] args) {
        // Create our regulator
        FishingRegulator main_regulator = new FishingRegulator(28.0);

        // Add fish to it
        main_regulator.addFish(new StripedBass(10.0));
        main_regulator.addFish(new StripedBass(15.5));
        main_regulator.addFish(new StripedBass(18.0));
        main_regulator.addFish(new StripedBass(29.5));
        main_regulator.addFish(new StripedBass(45.5));

        // Now loop over the legal fish and output them
        System.out.println("Main regulator - legal fish");

        for (Fish fish : main_regulator.getLegalFish()) {
            System.out.println(fish); // We can do this as we defined toString()
        }

        System.out.println(); // Clear line

        // Let's try an alternate way of doing this

        // Create our set of fish
        Set<Fish> fishingNet = new HashSet<>();

        // Add fish to the net
        fishingNet.add(new StripedBass(10.0));
        fishingNet.add(new StripedBass(15.5));
        fishingNet.add(new StripedBass(18.0));
        fishingNet.add(new StripedBass(29.5));
        fishingNet.add(new StripedBass(45.5));

        // Now create our regulator and initialize it with our fishing net
        FishingRegulator secondary_regulator = new FishingRegulator(28.0, fishingNet);

        // Finally, loop over the legal fish and output them
        System.out.println("Secondary regulator - legal fish");

        for (Fish fish : secondary_regulator.getLegalFish()) {
            System.out.println(fish); // We can do this as we defined toString()
        }
    }
}
