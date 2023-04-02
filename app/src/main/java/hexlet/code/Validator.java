package hexlet.code;

import hexlet.code.schema.MapSchema;
import hexlet.code.schema.NumberSchema;
import hexlet.code.schema.StringSchema;

public class Validator {
    public static StringSchema string() {
        return new StringSchema();
    }
    public static NumberSchema number() {
        return new NumberSchema();
    }
    public static MapSchema map() {
        return new MapSchema();
    }
}
