package homeworks.hw9;


import homeworks.hw9.LoggingLevel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogginLevelTest {
    @Test
    void testIsEnabled() {
        assertTrue (LoggingLevel.DEBUG.isEnabled(LoggingLevel.INFO));
        assertFalse(LoggingLevel.INFO.isEnabled(LoggingLevel.DEBUG));
    }
}
