import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateFees extends ParkingOut {
	static long Total_incom = 0;

	public CalculateFees() {

	}

	static long Calculateparkingfees() {
		ParkingIn Pin = new ParkingIn();
		ParkingOut Pout = new ParkingOut();
		Date start_date = Pin.Markarrivaltime();
		Date end_date = Pout.Markdeparturetime();

		Date d1 = start_date;
		Date d2 = end_date;
		long difference_In_Time = d2.getTime() - d1.getTime();

		// long difference_In_Seconds = TimeUnit.MILLISECONDS
		// .toSeconds(difference_In_Time) % 60;

		long difference_In_Minutes = TimeUnit.MILLISECONDS
				.toMinutes(difference_In_Time) % 60;

		long difference_In_Hours = TimeUnit.MILLISECONDS
				.toHours(difference_In_Time) % 24;

		long difference_In_Days = TimeUnit.MILLISECONDS
				.toDays(difference_In_Time) % 365;

		long difference_In_Years = TimeUnit.MILLISECONDS
				.toDays(difference_In_Time) / 365l;
		long hours = difference_In_Years * 365 * 24 + difference_In_Days * 24
				+ difference_In_Hours;
		long parking_fees = (long) (hours * 5 + 0.0833 * difference_In_Minutes);

		// difference_In_Seconds

		return parking_fees;
	};

	public long Calculatetotalincome() {
		Total_incom = Total_incom + Calculateparkingfees();
		return Total_incom;
	};

}
