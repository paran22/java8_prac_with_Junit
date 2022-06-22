public class PrintAppleColor implements PrintApplePredicate {
    @Override
    public void print(Apple apple) {
        System.out.println(apple.getColor().name());
    }
}
