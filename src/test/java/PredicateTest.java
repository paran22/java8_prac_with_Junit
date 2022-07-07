import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class PredicateTest {

    Apples apples;
    Pineapples pineapples;

    @BeforeEach
    void createApples() {
        apples = new Apples(
                new Apple(Color.GREEN, 20),
                new Apple(Color.RED, 60));
        pineapples = new Pineapples(
                new Pineapple(50),
                new Pineapple(70),
                new Pineapple(90));
    }

    @Test
    void filter_green_apples_with_Predicate() {
        List<Apple> filteredApples = Apples.filter(apples.getApples(),
                (Apple apple) -> apple.getColor().equals(Color.GREEN));
        Assertions.assertThat(filteredApples.size()).isEqualTo(1);
    }

    @Test
    void filter_heavy_pineapples_with_Predicate() {
        List<Pineapple> filteredPineapples = Pineapples.filter(pineapples.getPineapples(),
                (Pineapple pineapple) -> pineapple.getWeight() > 50);
    }

}