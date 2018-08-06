import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Get current time in San Francisco (GMT -7, in other words PST).
 */
public class Exercise06 {
	public ZonedDateTime getTimeInCalifornia() {
		return ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
	}
}
