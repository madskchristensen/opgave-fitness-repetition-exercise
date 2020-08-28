public class Person {
    protected String name;
    protected String cpr;

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    @Override
    public String toString() {
        return name + "\t" + cpr;
    }
}
