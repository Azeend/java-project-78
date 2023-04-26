package hexlet.code.schemas;


public class StringSchema extends BaseSchema {
    public final StringSchema required() {
        setRequired();
        addToConditionList(x -> x instanceof String && !x.equals("") &&  x != null);
        return this;
    }

    public final StringSchema minLength(int number) {
        addToConditionList(x -> x instanceof String && ((String) x).length() >= number);
        return this;
    }

    public final StringSchema contains(String substring) {
        addToConditionList(x -> x instanceof String && ((String) x).contains(substring));
        return this;
    }
}
