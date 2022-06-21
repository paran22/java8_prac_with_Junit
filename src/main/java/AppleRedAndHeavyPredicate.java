public class AppleRedAndHeavyPredicate implements ApplePredicate {

    private final int WEIGHT = 50;

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.RED) && apple.getWeight() > WEIGHT;
    }
}
