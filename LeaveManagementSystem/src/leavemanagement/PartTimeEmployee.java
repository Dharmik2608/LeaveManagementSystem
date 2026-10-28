
package leavemanagement;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, String department) {
        super(id, name, department, 10);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return 10;
    }
}
