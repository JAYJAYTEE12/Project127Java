package Debugging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DebugUtils {
    public static String getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
