package exercises.july31.real.com.scjaexam.tutorial.planets;

import exercises.july31.real.com.scjaexam.tutorial.interfaces.Planet;

/**
 * Earth class
 */
public class Mars implements Planet {

    private String name;

    public Mars() {
        this.name = "Mars";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Hello from %s!", this.name);
    }
}
