package hexlet.code.schema;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Schema {
    private final List<Predicate<Object>> conditions = new ArrayList<>();
    public final void addToConditionList(Predicate<Object> condition) {
        conditions.add(condition);
    }

    public final boolean isValid(Object o) {
        for (Predicate<Object> p : conditions) {
            if (!p.test(o)) {
                return false;
            }
        }
        return true;
    }
}
