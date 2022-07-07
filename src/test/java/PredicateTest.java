import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredicateTest {

    Apples apples;

    @BeforeEach
    void createApples() {
        apples = new Apples(
                new Apple(Color.GREEN, 20),
                new Apple(Color.RED, 60));
    }

    @Test
    void filter_green_apples_with_Predicate() {
        List<Apple> filteredApples = Apples.filter(apples.getApples(),
                (Apple apple) -> apple.getColor().equals(Color.GREEN));
    }

}