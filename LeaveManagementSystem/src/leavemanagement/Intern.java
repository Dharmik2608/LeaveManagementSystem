
package leavemanagement;

public class Intern extends Employee {
    public Intern(int id, String name, String department) {
        super(id, name, department, 5);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return 5;
    }
}
