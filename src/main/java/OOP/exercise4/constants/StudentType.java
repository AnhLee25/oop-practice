package OOP.exercise4.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StudentType {
    NORMAL(0), GOOD(1);
    private final Integer value;
}
