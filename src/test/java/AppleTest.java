import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class AppleTest {

    List<Apple> apples = new ArrayList<>();

    @BeforeEach
    void createApples() {
        Apple greenApple = new Apple(Color.GREEN);
        Apple redApple = new Apple(Color.RED);

        apples.add(greenApple);
        apples.add(redApple);
    }

    @Test
    void filter_GREEN_apple() {
        Assertions.assertThat(Apple.filterGreenApples(apples).size()).isEqualTo(1);
    }

}