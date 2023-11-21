package homeworks.hw9;

import java.io.File;

public class FileLoggerConfiguration {
    private File file;
    private LoggingLevel level;
    private long maxSize;
    private String format;


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}


