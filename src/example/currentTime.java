package example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

public class currentTime {

	public static void main(String[] args) {
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println(currentTime);
		currentTime.withDayOfMonth(10);
		
	}

}
