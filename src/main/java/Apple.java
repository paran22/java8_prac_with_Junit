import java.util.ArrayList;
import java.util.List;

public class Apple {
    private Color color;

    public Apple(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
}
