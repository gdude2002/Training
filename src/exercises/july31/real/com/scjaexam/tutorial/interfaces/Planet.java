package exercises.july31.real.com.scjaexam.tutorial.interfaces;

/**
 * Planet interface, base all other planets off of this one.
 *
 * An /interface/ is a set of methods that all /implementing/ classes
 * need to define. We can then refer to all derived classes as `Planet`,
 * which allows for easier addressing of multiple classes that implement
 * the same methods.
 */
public interface Planet {
    // Getters and setters for the planet's name
    public String getName();
    public void setName(String name);

    // Convenience method to get the output message
    public String getMessage();
}
