package WEEK3.OOPS;


abstract class Compartment {

    // Har compartment apna notice return karega
    public abstract String notice();
}

class FirstClass extends Compartment {

    @Override
    public String notice() {
        return "First Class: Reserved for first class passengers.";
    }
}

class Ladies extends Compartment {

    @Override
    public String notice() {
        return "Ladies: Reserved only for women passengers.";
    }
}

class General extends Compartment {

    @Override
    public String notice() {
        return "General: Open for all passengers.";
    }
}

class Luggage extends Compartment {

    @Override
    public String notice() {
        return "Luggage: Only luggage should be kept here.";
    }
}