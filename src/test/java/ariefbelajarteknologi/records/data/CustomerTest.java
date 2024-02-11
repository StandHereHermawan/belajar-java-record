package ariefbelajarteknologi.records.data;

import org.junit.jupiter.api.Test;

import java.lang.reflect.RecordComponent;

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

    @Test
    void constructor() {
        Customer customer = new Customer("1", "Hilmi", "denganimi@proton.com");
        assertNotNull(customer);

        assertEquals("1", customer.id());
        assertEquals("Hilmi", customer.name());
        assertEquals("denganimi@proton.com", customer.email());
        assertNull(customer.phone());
    }

    @Test
    void canonicalConstructor() {
        Customer customer = new Customer("1", "Hilmi", "DENGANIMI@PROTON.COM");
        assertNotNull(customer);

        assertEquals("1", customer.id());
        assertEquals("Hilmi", customer.name());
        assertEquals("denganimi@proton.com", customer.email());
        assertNull(customer.phone());
    }

    @Test
    void recordMethod() {
        Customer customer = new Customer("1", "Hilmi", "DENGANIMI@PROTON.COM");
        assertEquals("Hello! Arief, my name is Hilmi", customer.sayHello("Arief"));
    }

    @Test
    void testRecordEqualsMethod() {
        Customer customer1 = new Customer("1", "Hilmi", "DENGANIMI@PROTON.COM");
        Customer customer2 = new Customer("1", "Hilmi", "DENGANIMI@PROTON.COM");

        assertTrue(customer1.equals(customer2));
        assertEquals(customer1.hashCode(), customer2.hashCode());
        assertEquals(customer1.toString(), customer2.toString());
    }

    @Test
    void reflection() {
        assertTrue(Customer.class.isRecord());

        RecordComponent[] components = Customer.class.getRecordComponents();
        assertEquals(4, components.length);

        for (RecordComponent component : components) {
            System.out.println(component.getName());
            System.out.println(component.getType());
        }
    }
}