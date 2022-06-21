public class FilterAppleUnderFiftyWeight implements FilterApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 50;
    }
}
