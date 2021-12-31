package ch2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OverloadsTest {

    @Test
    void checkOverloads() {
        Assertions.assertAll("overloads called from Java",
                () -> System.out.println(OverloadsKt.addProduct("Name", 5.0, "Desc")),
                () -> System.out.println(OverloadsKt.addProduct("Name", 5.0)),
                () -> System.out.println(OverloadsKt.addProduct("Name"))
        );
    }

}
