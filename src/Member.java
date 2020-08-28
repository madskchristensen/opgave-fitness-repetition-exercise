public class Member extends Person {
    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType() {
        if(isBasic) {
            return "Basic";
        } else {
            return "Full";
        }
    }

    public int monthlyFee() {
        if(getMemberType().equals("Basic")) {
            return 199;
        } else {
            return 299;
        }
    }

    @Override
    public String toString() {
        return name + "\t \t" + cpr + "\t \t" + getMemberType() + "\t \t" + monthlyFee();
    }
}