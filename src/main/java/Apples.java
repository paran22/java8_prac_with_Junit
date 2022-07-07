import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Apples {
    private final List<Apple> apples;

    public Apples(Apple... apple) {
        this.apples = new ArrayList<>();
        Collections.addAll(apples, apple);
    }

    public Apples(List<Apple> apples) {
        this.apples = apples;
    }

    public List<Apple> getApples() {
        return apples;
    }

    public Apples filterApples(FilterApplePredicate p) {
        return new Apples(apples.stream()
                .filter(p::test)
                .collect(Collectors.toList()));
    }

    public void printApples(PrintApplePredicate p) {
        apples.forEach(p::print);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
