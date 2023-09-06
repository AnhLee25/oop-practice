package OOP.exercise4.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Sex {
    MALE(0), FEMALE(1);
    private final Integer value;
}
