package exercises.july31.real.com.scjaexam.tutorial;

import exercises.july31.real.com.scjaexam.tutorial.interfaces.Planet;
import exercises.july31.real.com.scjaexam.tutorial.planets.Earth;
import exercises.july31.real.com.scjaexam.tutorial.planets.Mars;
import exercises.july31.real.com.scjaexam.tutorial.planets.Venus;

import java.util.ArrayList;
import java.util.List;

/**
 * Greetings Universe main file - literal version
 */
class GreetingsUniverse {

    public static void main(String[] args) {
        System.out.println("Greetings, universe!");

        // We want to store everything that implements Planet
        List<Planet> planets = new ArrayList<>();

        // Just directly store the instances
        planets.add(new Earth());
        planets.add(new Mars());
        planets.add(new Venus());

        for (Planet planet : planets) { // "Smart" loop
            System.out.println(planet.getMessage());
        }

        System.out.println(""); // Blank line for separation

        // Clear it for another example
        planets.clear();

        // Always try to use the base type or interface in declarations
        Planet earth = new Earth();

        // This is known as a getter - it returns the contents of a private field
        System.out.println(String.format("Earth's name is %s", earth.getName()));

        // This is a setter, for setting the contents of a private field
        earth.setName("Jupiter");

        // So now Earth is actually Jupiter
        System.out.println(String.format("Earth's name is %s", earth.getName()));
        System.out.println(""); // Blank line for separation

        planets.add(earth);

        // Of course, we can add this as many times as we like
        planets.add(earth);
        planets.add(earth);

        for (Planet planet : planets) {
            System.out.println(planet.getMessage());
        }

        System.out.println(""); // Blank line for separation

        // What happens if we change the name back to Earth?
        earth.setName("Earth");

        for (Planet planet : planets) {
            System.out.println(planet.getMessage());
        }
    }
}
