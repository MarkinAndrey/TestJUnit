import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarsTest {

    Cars car;

    @ParameterizedTest
    @CsvSource({"'KIA', 12000, 1",
            "'BYD', 11000, 5"})
    void getName(String name, int prise, int old) {
        car = new Cars(name, prise, old);
        assertEquals(name, car.getName());
    }

    @ParameterizedTest
    @CsvSource({"'KIA', 12000, 1, 'Hyndau'",
            "'BYD', 11000, 5, 'Great Woll'"})
    void setName(String name, int prise, int old, String newName) {
        car = new Cars(name, prise, old);
        car.setName(newName);
        assertEquals(newName, car.getName());
    }

    @Test
    void newYear() {
        car = new Cars("KIA", 10000, 0);
        car.newYear();
        assertEquals(1, car.getOld());
    }
}