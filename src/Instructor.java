public class Instructor extends Employee {

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours, 456);
    }

    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return name + "\t \t" + cpr + "\t \t" + super.getHours() + "\t \t" + getSalary();
    }
}