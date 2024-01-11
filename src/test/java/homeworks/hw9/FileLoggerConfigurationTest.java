package homeworks.hw9;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileLoggerConfigurationTest {
    @Test
    void testSetAndGetFile() {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        File testFile = new File("test.log");
        config.setFile(testFile);

        assertEquals(testFile, config.getFile());
    }

    @Test
    void testSetAndGetLevel() {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        config.setLevel(LoggingLevel.DEBUG);

        assertEquals(LoggingLevel.DEBUG, config.getLevel());
    }

    @Test
    void testSetAndGetMaxSize() {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        long maxSize = 10000L;
        config.setMaxSize(maxSize);

        assertEquals(maxSize, config.getMaxSize());
    }

    @Test
    void testSetAndGetFormat() {
        FileLoggerConfiguration config = new FileLoggerConfiguration();
        String format = "%1$s %2$s %3$s";
        config.setFormat(format);

        assertEquals(format, config.getFormat());
    }
}
