
package leavemanagement;

public abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String department;
    private int leaveBalance;
    private int leaveTaken;

    public Employee(int employeeId, String employeeName,
                    String department, int leaveBalance) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.leaveBalance = leaveBalance;
        this.leaveTaken = 0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public abstract int getAnnualLeaveAllowance();

    public void applyLeave(int days) {
        if (days <= 0) {
            System.out.println("Leave days must be positive.");
        } else if (days > leaveBalance) {
            System.out.println("Insufficient leave balance.");
        } else {
            leaveBalance -= days;
            leaveTaken += days;
            System.out.println("Leave applied successfully.");
        }
    }

    // Method overloading
    public void applyLeave(int days, String reason) {
        System.out.println("Leave reason: " + reason);
        applyLeave(days);
    }

    public void cancelLeave(int days) {
        if (days <= 0 || days > leaveTaken) {
            System.out.println("Invalid cancellation.");
        } else {
            leaveBalance += days;
            leaveTaken -= days;
            System.out.println("Leave cancelled successfully.");
        }
    }

    public void checkLeaveBalance() {
        System.out.println("Leave balance: " + leaveBalance);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Department: " + department);
        System.out.println("Leave balance: " + leaveBalance);
    }
}
