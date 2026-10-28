
package leavemanagement;

import java.util.ArrayList;
import java.util.List;

public class LeaveManager {
    private List<LeaveRequest> requests = new ArrayList<>();
    private int nextRequestId = 1;

    public void submitLeaveRequest(Employee employee,
                                   int days, String reason) {
        if (days <= 0 || days > employee.getLeaveBalance()) {
            System.out.println("Request rejected: invalid leave days.");
            return;
        }

        LeaveRequest request = new LeaveRequest(
            nextRequestId++, employee, days, reason
        );

        employee.applyLeave(days);

        request.setStatus("APPROVED");
        requests.add(request);

        System.out.println("Request processed successfully.");
        request.displayRequest();
    }

    public void cancelRequest(int requestId) {
        for (LeaveRequest request : requests) {
            if (request.getRequestId() == requestId
                    && request.getStatus().equals("APPROVED")) {
                request.getEmployee().cancelLeave(request.getDays());
                request.setStatus("CANCELLED");
                System.out.println("Request cancelled.");
                return;
            }
        }

        System.out.println("No active request found.");
    }

    public void displayAllRequests() {
        if (requests.isEmpty()) {
            System.out.println("No leave requests available.");
            return;
        }

        for (LeaveRequest request : requests) {
            request.displayRequest();
            System.out.println("----------------");
        }
    }
}
