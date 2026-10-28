
package leavemanagement;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FulltimeEmployee(
            101, "Arun", "Engineering"
        );

        Employee emp2 = new PartTimeEmployee(
            102, "Priya", "Testing"
        );

        Employee emp3 = new Intern(
            103, "Rahul", "Development"
        );

        Employee emp4 = new Manager(
            104, "Meera", "Engineering"
        );

        // Demonstrates polymorphism
        Employee[] employees = {emp1, emp2, emp3, emp4};

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println(
                "Annual allowance: "
                + employee.getAnnualLeaveAllowance()
            );
            System.out.println("----------------");
        }

        LeaveManager leaveManager = new LeaveManager();

        leaveManager.submitLeaveRequest(
            emp1, 3, "Personal work"
        );

        emp1.checkLeaveBalance();

        leaveManager.displayAllRequests();

        leaveManager.cancelRequest(1);

        emp1.checkLeaveBalance();

        // Demonstrates method overloading
        emp2.applyLeave(2, "Family function");
        emp2.checkLeaveBalance();
    }
}
