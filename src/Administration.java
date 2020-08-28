public class Administration extends Employee {
    private int vacation;

    public Administration(String name, String cpr) {
        super(name, cpr, 37, 23000/37);
        this.vacation = 5;
    }

    public int getVacation() {
        return vacation;
    }

    @Override
    public String toString() {
        return name + "\t \t" + cpr + "\t \t" + super.getHours() + "\t \t" + super.getSalary() + "\t \t" + vacation;
    }
}
