import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilterAppleTest {

    FilterAppleByColor filterGreenAppleByColor = new FilterAppleByColor();
    FilterAppleUnderFiftyWeight filterAppleUnderFiftyWeight = new FilterAppleUnderFiftyWeight();

    Apple greenAppleWithSixtyWeight = new Apple(Color.GREEN, 60);

    @Test
    void filter_green_apple() {
        Assertions.assertThat(filterGreenAppleByColor.test(greenAppleWithSixtyWeight))
                .isTrue();
    }

    @Test
    void filter_apple_under_fifty_weight() {
        Assertions.assertThat(filterAppleUnderFiftyWeight.test(greenAppleWithSixtyWeight))
                .isFalse();
    }
}
