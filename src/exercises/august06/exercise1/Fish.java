package exercises.august06.exercise1;

/**
 * Created by bw5 on 06/08/2014.
 */
public abstract class Fish {

    /**
     * Return the type of fish.
     */
    public abstract String getType();

    /**
     * Return the size of the fish, in inches.
     */
    public abstract Double size();

    @Override
    public boolean equals(Object object) {
        // This method determines whether two Fish are equal
        if (object instanceof Fish) {
            // Firstly, we check that the object is actually a Fish
            return (
                // Then we check that they're the same type and length
                ((Fish) object).getType().equals(this.getType()) &&
                ((Fish) object).size().equals(this.size())
            );
        }

        return false;
    }

    public String toString() {
        // This returns the string representation of the Fish object
        return String.format("%s (%s inches)", this.getType(), this.size());
    }
}
