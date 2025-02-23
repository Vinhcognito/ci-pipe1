import java.util.Calendar;

public class Greeting {
    private static final String COURSE = "COMP367";
// test
    public static String getGreeting(String name) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String greeting = (hour < 12) ?
                "Good morning" :
                "Good afternoon";

        return String.format("%s, %s, Welcome to %s",
                greeting,
                name,
                COURSE);
    }
}

