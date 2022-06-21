public class FilterAppleUnderFiftyWeight implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 50;
    }
}
