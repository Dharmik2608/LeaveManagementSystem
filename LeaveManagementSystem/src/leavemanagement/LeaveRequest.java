
package leavemanagement;

public class LeaveRequest {
    private int requestId;
    private Employee employee;
    private int days;
    private String reason;
    private String status;

    public LeaveRequest(int requestId, Employee employee,
                        int days, String reason) {
        this.requestId = requestId;
        this.employee = employee;
        this.days = days;
        this.reason = reason;
        this.status = "PENDING";
    }

    public int getRequestId() {
        return requestId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getDays() {
        return days;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayRequest() {
        System.out.println("Request ID: " + requestId);
        System.out.println("Employee: " + employee.getEmployeeName());
        System.out.println("Days: " + days);
        System.out.println("Reason: " + reason);
        System.out.println("Status: " + status);
    }
}
