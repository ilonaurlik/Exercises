import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise06 {
	public ZonedDateTime getTimeInCalifornia() {
		return ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
	}
}
