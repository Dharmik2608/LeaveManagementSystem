
package leavemanagement;

public class Manager extends Employee {
    public Manager(int id, String name, String department) {
        super(id, name, department, 30);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return 30;
    }
}
