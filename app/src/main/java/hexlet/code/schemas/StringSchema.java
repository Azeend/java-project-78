package hexlet.code.schemas;


public class StringSchema extends BaseSchema {
    public final StringSchema required() {
        addToConditionList(x -> x instanceof String && !"".equals(x) &&  x != null);
        return this;
    }

    public final StringSchema minLength(int number) {
        addToConditionList(x -> ((String) x).length() >= number);
        return this;
    }

    public final StringSchema contains(String substring) {
        addToConditionList(x -> ((String) x).contains(substring));
        return this;
    }
}
