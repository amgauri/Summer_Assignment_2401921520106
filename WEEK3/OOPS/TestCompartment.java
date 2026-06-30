package WEEK3.OOPS;

    import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class compartment: Reserved for first class passengers.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies compartment: Reserved for women passengers.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General compartment: Open for general passengers.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage compartment: Used for carrying luggage only.";
    }
}

public class TestCompartment {

    public static void main(String[] args) {
        Compartment[] coaches = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < coaches.length; i++) {
            int type = random.nextInt(4) + 1;

            if (type == 1) {
                coaches[i] = new FirstClass();
            } else if (type == 2) {
                coaches[i] = new Ladies();
            } else if (type == 3) {
                coaches[i] = new General();
            } else {
                coaches[i] = new Luggage();
            }
        }

        for (int i = 0; i < coaches.length; i++) {
            System.out.println("Coach " + (i + 1) + ": " + coaches[i].notice());
        }
    }
}

