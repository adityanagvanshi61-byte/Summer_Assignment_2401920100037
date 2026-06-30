import java.util.Random;

// Abstract base class
abstract class Compartment {
    public abstract String notice();
}

// Subclass for First Class
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a First Class compartment. Please keep your ticket ready.";
    }
}

// Subclass for Ladies
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is reserved exclusively for ladies.";
    }
}

// Subclass for General
class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: This is a General compartment. Please accommodate fellow passengers.";
    }
}

// Subclass for Luggage
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is for luggage only. No passengers allowed.";
    }
}

// Test Class
public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            // Generate random number 1-4
            int type = rand.nextInt(4) + 1;

            if (type == 1) {
                compartments[i] = new FirstClass();
            } else if (type == 2) {
                compartments[i] = new Ladies();
            } else if (type == 3) {
                compartments[i] = new General();
            } else {
                compartments[i] = new Luggage();
            }

            // Polymorphic behavior: calling notice() on the abstract reference
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}
