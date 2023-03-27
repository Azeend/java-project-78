package hexlet.code.schema;

public class NumberSchema extends Schema {
    public final NumberSchema required() {
        addToConditionList(x -> x instanceof Integer && x != null);
        return this;
    }
    public final NumberSchema positive() {
        addToConditionList(x -> x == null || x instanceof Integer && (Integer) x > 0);
        return this;
    }
    public final NumberSchema range(int number1, int number2) {
        addToConditionList(x -> x instanceof Integer && (Integer) x >= number1 && (Integer) x <= number2);
        return this;
    }
}
