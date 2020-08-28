import java.util.List;

public class Printer {
    public static void printEmployees(List<Employee> employeeList) {
        System.out.println("FITNESS EMPLOYEES");
        System.out.println("Name" + "\t \t" + "Cpr" + "\t \t" + "Hours" + "\t \t" + "Salary" + "\t \t" + "Vacation");
        System.out.println("*****************************************************");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("=====================================================");
    }

    public static void printMembers(List<Member> memberList) {
        System.out.println("FITNESS MEMBERS");
        System.out.println("Name" + "\t \t" + "Cpr" + "\t \t" + "Member type" + "\t \t" + "Fee");
        System.out.println("*****************************************************");
        for (Member member : memberList) {
            System.out.println(member);
        }
        System.out.println("=====================================================");
    }

    public static void printEmployeesAndMembers(List<Employee> employeeList, List<Member> memberList) {
        System.out.println("EMPLOYEES & MEMBERS");
        System.out.println("Name" + "\t \t" + "Cpr");
        System.out.println("*****************************************************");
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + "\t \t" + employee.getCpr());
        }
        for (Member member : memberList) {
            System.out.println(member.getName() + "\t \t" + member.getCpr());
        }
        System.out.println("=====================================================");
    }
}