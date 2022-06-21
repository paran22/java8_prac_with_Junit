import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.GREEN;

public class Apple {
    private Color color;

    public Apple(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor().equals(Color.GREEN)) {
                result.add(apple);
            }
        }
        return result;
    }
}
