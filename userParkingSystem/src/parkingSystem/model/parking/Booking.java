import java.time.Duration;
import java.time.LocalDateTime;

public class Booking {

    private User user;
    private ParkingSpace space;
    private boolean noShow;
    private boolean checkedIn;
    private boolean checkedOut;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime actualEndTime;

    public Booking(User user, ParkingSpace space,
                   LocalDateTime startTime, LocalDateTime endTime) {
        this.user = user;
        this.space = space;
        this.startTime = startTime;
        this.endTime = endTime;
        this.checkedIn = false;
        this.checkedOut = false;
        this.noShow = false;
    }

    public double calculateFees() {
        double totalHours = Duration.between(startTime, endTime).toHours();
        return totalHours * user.getRate();
    }
    public void processDeposit() {
        double deposit = user.getRate();
        //Process deposit for no-shows
    }
    public void refundFees() {
        double totalHours = Duration.between(startTime, endTime).toHours();
        double fees = totalHours * user.getRate();
        //Process refund for cancellation
    }

    public void noShow() {
        if(!checkedIn && LocalDateTime.now().isAfter(this.startTime)) {
            this.noShow = true;
            this.space.enable();
        }
    }
    public void updateTime(LocalDateTime newStart, LocalDateTime newEnd) {
        this.startTime = newStart;
        this.endTime = newEnd;
    }
    public void extendTime(LocalDateTime newEnd) {
        this.endTime = newEnd;
    }
    public void checkedIn() {
        this.checkedIn = true;
    }
    public void checkedOut() {
        this.checkedOut = true;
        this.actualEndTime = LocalDateTime.now();
    }
    public LocalDateTime getStartTime() {
        return this.startTime;
    }
    public LocalDateTime getEndTime() {
        return this.endTime;
    }
    public boolean isCheckedOut() {
        return this.checkedOut;
    }
    public void setCheckedInStatus(boolean b) {
        this.checkedIn = b;
    }
    public User getUser() {
        return this.user;
    }
    public ParkingSpace getSpace() {
        return this.space;
    }

    public String toString() {
        String start = startTime.getHour() + ":" + startTime.getMinute() + " " + startTime.getMonthValue() + "/" + startTime.getDayOfMonth();
        String end = endTime.getHour() + ":" + endTime.getMinute() + " " + endTime.getMonthValue() + "/" + endTime.getDayOfMonth();

        return "Booking: " + user.email + " - Location: " + space.getLot() + " - Lot: " + space.getId() + " - Time: " + start + " to " + end;
    }

}
