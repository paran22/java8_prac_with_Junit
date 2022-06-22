import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.EnumSet;

class AppleTest {

    Apples apples;

    @BeforeEach
    void createApples() {
        apples = new Apples(new Apple(Color.GREEN, 20),
                new Apple(Color.RED, 60));
    }

    @Test
    void filter_apples_with_ApplePredicate() {
        Assertions.assertThat(
                apples.filterApples(new FilterAppleRedAndHeavyPredicate()).size())
                .isEqualTo(1);
    }

    @Test
    void print_apples_with_Predicate() {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        apples.printApples(new PrintAppleColor());
        Assertions.assertThat(out).toString().contains(Color.GREEN.name());
    }

}