public class FilterAppleByColor implements FilterApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
