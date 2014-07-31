package exercises.july31.literal.com.scjaexam.tutorial;

import exercises.july31.literal.com.scjaexam.tutorial.planets.Earth;
import exercises.july31.literal.com.scjaexam.tutorial.planets.Mars;
import exercises.july31.literal.com.scjaexam.tutorial.planets.Venus;

/**
 * Greetings Universe main file - literal version
 */
class GreetingsUniverse {

    public static void main(String[] args) {
        System.out.println("Greetings, universe!");

        // We're using side-effects, so we don't need to store these.
        // Note: Don't ever do this in real code! Make methods!
        // Side-effects are bad because they're unpredictable!
        new Earth();
        new Mars();
        new Venus();
    }
}
