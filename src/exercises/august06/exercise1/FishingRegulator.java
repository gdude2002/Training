package exercises.august06.exercise1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bw5 on 06/08/2014.
 */
public class FishingRegulator {
    // Set is more suitable. Why?
    private Set<Fish> fishToTest;

    private Double legalLength;

    public FishingRegulator(Double length) {
        this.fishToTest = new HashSet<>();
        this.legalLength = length;
    }

    // This is called method overloading. Neat, isn't it?
    //
    // We can have multiple methods with the same name but that take
    // different arguments - even constructors, as we have here.
    public FishingRegulator(Double length, Collection<Fish> fishes) {
        this.fishToTest = new HashSet<>();
        this.legalLength = length;

        this.fishToTest.addAll(fishes);
    }

    public void addFish(Fish fish) {
        this.fishToTest.add(fish);
    }

    public void removeFish(Fish fish) {
        this.fishToTest.remove(fish);
    }

    public boolean isLegal(Fish fish) {
        return fish.size() <= this.legalLength;
    }

    public Set<Fish> getLegalFish() {
        Set<Fish> result = new HashSet<>();

        for (Fish fish : this.fishToTest) {
            if (this.isLegal(fish)) {
                result.add(fish);
            }
        }

        return result;
    }
}
