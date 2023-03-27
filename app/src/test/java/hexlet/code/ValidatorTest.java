package hexlet.code;

import hexlet.code.schema.StringSchema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidatorTest {
    @Test
    public void testStringSchema() {
        Validator v = new Validator();
        StringSchema schema = v.string();
        final int number = 5;

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(""));
        assertTrue(schema.isValid("what does the fox say"));
        assertTrue(schema.isValid(number));

        schema.required();

        assertTrue(schema.isValid("what does the fox say"));
        assertTrue(schema.isValid("hexlet"));
        assertFalse(schema.isValid(null));
        assertFalse(schema.isValid(""));
        assertFalse(schema.isValid(number));

        schema.minLength(number);
        assertTrue(schema.isValid("what does the fox say"));

        assertTrue(schema.contains("wh").isValid("what does the fox say"));
        assertTrue(schema.contains("what").isValid("what does the fox say"));
        assertFalse(schema.contains("whatthe").isValid("what does the fox say"));
        assertTrue(schema.isValid("whatthe does fox say"));

        assertFalse(schema.isValid("what does the fox say"));
    }
}
