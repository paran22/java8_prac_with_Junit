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

    public List<Apple> filterApples(FilterApplePredicate p) {
        return apples.stream()
                .filter(p::test)
                .collect(Collectors.toList());
    }

    public void printApples(PrintApplePredicate p) {
        apples.forEach(p::print);
    }

}
