import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class AppleTest {

    List<Apple> apples = new ArrayList<>();

    @BeforeEach
    void createApples() {
        Apple greenApple = new Apple(Color.GREEN, 20);
        Apple redApple = new Apple(Color.RED, 60);

        apples.add(greenApple);
        apples.add(redApple);
    }

    @Test
    void filter_GREEN_apple() {
        Assertions.assertThat(Apple.filterApplesByColor(apples, Color.GREEN).size()).isEqualTo(1);
    }

    @Test
    void filter_RED_apple() {
        Assertions.assertThat(Apple.filterApplesByColor(apples, Color.RED).size()).isEqualTo(1);
    }

    @Test
    void filter_apple_under_50_weight() {
        Assertions.assertThat(Apple.filterApplesUnderWeight(apples, 50).size())
                .isEqualTo(1);
    }

}