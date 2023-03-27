package hexlet.code.schema;


public class StringSchema extends Schema {
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
    /*private List<String> substrings = new ArrayList<>();
    private int minLength;
    private String stringStatus = "";

    public void required() {
        stringStatus = "not empty";
    }
    public void minLength(int number) {
        minLength = number;
    }
    public StringSchema contains(String substring) {
        substrings.add(substring);
        return this;
    }

    public boolean isValid(Object o) {
        if (stringStatus.equals("")) {
            return o == null || o.equals("");
        }
        if (!(o instanceof String)) {
            return false;
        }
        for (String substring : substrings) {
            if(!o.toString().contains(substring)) {
                return false;
            }
        }
        if (stringStatus.equals("not empty")) {
            return !((String)o).isEmpty();
        }
        if (((String) o).length() >= minLength ) {
            return true;
        }
        return false;
    }*/
}








































    /*public StringSchema required() {
        addToConditionList(x -> x instanceof String && !x.equals(""));
        setCheckSchema(true);
        return this;
    }

    public StringSchema minLength(int number) {
        addToConditionList(x -> x.toString().length() >= number);
        return this;
    }

    public StringSchema contains(String s) {
        addToConditionList(x -> x.toString().contains(s));
        return this;
    }*/
