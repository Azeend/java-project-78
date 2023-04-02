package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends Schema {

    public final MapSchema required() {
        addToConditionList(x -> x instanceof Map);
        return this;
    }
    public final MapSchema sizeof(int number) {
        addToConditionList(x -> x instanceof Map && ((Map<?, ?>) x).size() == number);
        return this;
    }
    public final MapSchema shape(Map<String, Schema> map) {
        addToConditionList(mapForCheck -> map.entrySet().stream()
                .allMatch(keyValuePair -> {
                    Object valueOfMapForCheck = ((Map<?, ?>) mapForCheck).get(keyValuePair.getKey());
                    return keyValuePair.getValue().isValid(valueOfMapForCheck);
                })
        );
        return this;
    }
    /*
    public final MapSchema shape(Map<String, Schema> map) {
        addToConditionList(x -> checkMaps(x, map)
        return this.
    }
    private boolean checkMaps(Map<String, Object> x, Map<String, Schema> map) {
        for (Map.Entry<String, Schema> keyValuePair : map.entrySet()) {
            String key = keyValuePair.getKey();
            Schema condition = keyValuePair.getValue();
            if(!condition.isValid(x.get(key))) {
                return false;
            }
        }
        return true;
    }*/
}
