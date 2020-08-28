import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static List<Member> generateMembers() {
        List<Member> memberList = new ArrayList<Member>();

        memberList.add(new Member("John", "101010-0303", true));
        memberList.add(new Member("Anne", "393912-2020", true));
        memberList.add(new Member("Gert", "723412-1031", false));
        memberList.add(new Member("Bente", "398331-2121", false));
        memberList.add(new Member("Mulle", "196478-1873", true));

        return memberList;
    }

    public static List<Employee> generateEmployees() {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Administration("Birte", "313121-0810"));
        employeeList.add(new Administration("Anastasia", "456721-0321"));
        employeeList.add(new Instructor("Lars", "723412-1031", 15));
        employeeList.add(new Instructor("Bent", "398331-2121", 23));
        employeeList.add(new Administration("Svendbent", "196478-1873"));

        return employeeList;
    }
}
