public class PrintAppleColor implements PrintApplePredicate {
    @Override
    public String print(Apple apple) {
        return apple.getColor().name();
    }
}
