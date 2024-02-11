package ariefbelajarteknologi.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    @Test
    void generic() {
        Data<String> person = new Data<>("Arief");
        assertEquals("Arief", person.data());

        Data<Integer> year = new Data<>(2003);
        assertEquals(2003, year.data());
    }
}