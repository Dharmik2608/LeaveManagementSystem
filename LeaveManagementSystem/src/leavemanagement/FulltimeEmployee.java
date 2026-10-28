package leavemanagement;

public class FulltimeEmployee extends Employee {

    public FulltimeEmployee(int id, String name, String department) {
        super(id, name, department, 20);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return 20;
    }
}