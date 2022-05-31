package fr.pantheonsorbonne.cri;

import java.util.Objects;

public class Apple {
    public static final String DEFAULT_COLOUR = "RED";
    public static final int DEFAULT_RADIUS = 5;
    final String colour;
    int radius;

    public Apple() {
        this(DEFAULT_COLOUR, DEFAULT_RADIUS);
    }

    public Apple(String colour, int radius) {
        this.colour = colour;
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColour(), getRadius());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return getRadius() == apple.getRadius() && Objects.equals(getColour(), apple.getColour());
    }

    public String getColour() {
        return colour;
    }

    public int getRadius() {
        return radius;
    }

    public void takeABite() throws TrognonException {
        if (this.radius > 1) {
            this.radius -= 1;
        } else {
            throw new TrognonException();
        }
    }
}
