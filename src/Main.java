import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Member> memberList = Generator.generateMembers();
        List<Employee> employeeList = Generator.generateEmployees();

        Printer.printEmployees(employeeList);
        System.out.println();
        Printer.printMembers(memberList);
        System.out.println();
        Printer.printEmployeesAndMembers(employeeList, memberList);

        /*
                Member member = new Member("John", "101010-0303", true);
        System.out.println("hej" + member);
         */
    }
}
