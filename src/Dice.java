import java.util.Objects;
import java.util.Random;

public class Dice implements IDiceThrow {

    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public int throwDice() {
        return new Random().nextInt(numberOfSides) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dice dice = (Dice) o;
        return numberOfSides == dice.numberOfSides;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSides);
    }

    @Override
    public String toString() {
        return "Kość " + numberOfSides + "-ścienna";
    }

}
