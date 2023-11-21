package homeworks.hw9;

import homeworks.hw9.ExeptionsHw9.FileMaxSizeReachedException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FileLogger {

    private FileLoggerConfiguration config;
    private PrintWriter writer;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }

    private void log(LoggingLevel level, String message) throws IOException, FileMaxSizeReachedException {
        if (config.getLevel().isEnabled(level)) {
            if (config.getFile().length() > config.getMaxSize()) { // was ">="
                throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxSize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
            }

            if (writer == null) {
                // відкриваємо файл за допомогою об'єкта PrintWriter
                writer = new PrintWriter(new FileWriter(config.getFile(), true));
            }
            // форматуємо повідомлення за допомогою конфігурації
            String formattedMessage = String.format(config.getFormat(), new Date(), level, message);
            // записуємо повідомлення у файл
            writer.println(formattedMessage);
            // змушуємо записувач вивести буфер у файл
            writer.flush();
        }
    }


    // публічний метод, який записує повідомлення з рівнем DEBUG


    //мб дебаг должен вызыватьв  себе инфо??
    public void debug(String message, String Imessage) throws IOException, FileMaxSizeReachedException {
        String message1 = "Debug message: " + message + " Info massage: " + Imessage;
        // викликаємо метод log з рівнем DEBUG
        if (config.getFile().length() > config.getMaxSize()) {
            log(LoggingLevel.DEBUG, message1);
        }
        else throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxSize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
    }

    // публічний метод, який записує повідомлення з рівнем INFO
    public void info(String message) throws IOException, FileMaxSizeReachedException {
        // викликаємо метод log з рівнем INFO
        if (config.getFile().length()> config.getMaxSize()) {
            log(LoggingLevel.INFO, message);
        }
        else throw new FileMaxSizeReachedException("Максимальний розмір файлу: " + config.getMaxSize() + ", поточний розмір файлу: " + config.getFile().length() + ", шлях до файлу: " + config.getFile().getPath());
    }
}