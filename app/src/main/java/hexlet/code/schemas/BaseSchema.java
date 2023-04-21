package hexlet.code.schemas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BaseSchema {
    private final List<Predicate<Object>> conditions = new ArrayList<>();

    private boolean isRequired;

    public void setRequired() {
        isRequired = true;
    }

    public final void addToConditionList(Predicate<Object> condition) {
        conditions.add(condition);
    }

    public final boolean isValid(Object o) {
        if (!isRequired) {
            return true;
        }
        for (Predicate<Object> p : conditions) {
            if (!p.test(o)) {
                return false;
            }
        }
        return true;
    }
}
