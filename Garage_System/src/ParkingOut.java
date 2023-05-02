import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ParkingOut extends ParkingIn {
	static boolean parkout = false;

	public Date Markdeparturetime() {
		parkout = true;
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Current Date " + dateFormat.format(date));
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		Date currentDatePlusOne = c.getTime();
		return currentDatePlusOne;
	}

};
