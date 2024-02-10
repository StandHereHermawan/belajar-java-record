package ariefbelajarteknologi.records.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void createNewRecord() {
        Customer customer = new Customer("1", "Hilmi", "denganimi@proton.com", "08516988675");

        System.out.println(customer);
        assertNotNull(customer);
    }

    @Test
    void getRecordProperty() {
        Customer customer = new Customer("1", "Hilmi", "denganimi@proton.com", "08516988675");
        assertNotNull(customer);

        assertEquals("1", customer.id());
        assertEquals("Hilmi", customer.name());
        assertEquals("denganimi@proton.com", customer.email());
        assertEquals("08516988675", customer.phone());
    }
}