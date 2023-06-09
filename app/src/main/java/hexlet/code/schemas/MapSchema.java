package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema {
    public final MapSchema required() {
        setRequired();
        addToConditionList(x -> x instanceof Map);
        return this;
    }

    public final MapSchema sizeof(int number) {
        addToConditionList(x -> x instanceof Map && ((Map<?, ?>) x).size() == number);
        return this;
    }

    public final MapSchema shape(Map<String, BaseSchema> map) {
        addToConditionList(mapForCheck -> map.entrySet().stream()
                .allMatch(keyValuePair -> {
                    Object valueOfMapForCheck = ((Map<?, ?>) mapForCheck).get(keyValuePair.getKey());
                    return keyValuePair.getValue().isValid(valueOfMapForCheck);
                })
        );
        return this;
    }
}
