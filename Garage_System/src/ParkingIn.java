import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParkingIn extends Slot {

	public ParkingIn() {
		// TODO Auto-generated constructor stub
	}

	public Date Markarrivaltime() {

		if (Availableslot()) {
			SimpleDateFormat dateFormat = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			System.out.println("Current Date " + dateFormat.format(date));
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			Date currentDatePlusOne = c.getTime();
			return currentDatePlusOne;
		}
		return null;

	}
}
