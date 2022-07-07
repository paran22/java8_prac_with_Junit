import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pineapples extends Fruits {
    private final List<Pineapple> pineapples;

    public Pineapples(Pineapple... pineapple) {
        this.pineapples = new ArrayList<>();
        Collections.addAll(pineapples, pineapple);
    }

    public Pineapples(List<Pineapple> pineapples) {
        this.pineapples = pineapples;
    }

    public List<Pineapple> getPineapples() {
        return pineapples;
    }
}
