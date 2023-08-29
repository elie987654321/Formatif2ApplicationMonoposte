package a21.climoilou.mono2.exercice_module_java.msd_logger;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Logger {
    private final Map<LocalDateTime, String> logs = new HashMap<>();

    public void log(String message) {
        logs.put(LocalDateTime.now(), message);
        System.out.println("at "+LocalDateTime.now()+", message: "+message);

    }
}
