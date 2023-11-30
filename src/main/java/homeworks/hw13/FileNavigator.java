package homeworks.hw13;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator(Map<String, List<FileData>> fileMap) {
        this.fileMap = fileMap;
    }

    public void add(String path) {
        java.io.File file = new java.io.File(path);
        if (file.isFile()) {
            FileData fileData = new FileData(file.getName(), file.length(), path);
            if (fileMap.containsKey(path)) {
                fileMap.get(path).add(fileData);
            }
            else {
                List<FileData> fileList = new ArrayList<>();
                fileList.add(fileData);
                fileMap.put(path, fileList);
            }
        }
        else {
            System.out.println("Шлях вказує на директорію, а не файл.");
        }
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(String path, long maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (FileData file : fileMap.getOrDefault(path, new ArrayList<>())) {
            if (file.getFileSize() <= maxSize) {
                filteredFiles.add(file);
            }
        }
        return filteredFiles;
    }
    public List<File> filterBySizeConToFile(String path, long maxSize) {
        List<File> filteredFiles = new ArrayList<>();
        for (FileData file : fileMap.getOrDefault(path, new ArrayList<>())) {
            if (file.getFileSize() <= maxSize) {
                java.io.File filefile = new File(file.getFilePath());
                filteredFiles.add(filefile);
            }
        }
        return filteredFiles;
    }
    //зробив ще варіант який повертає список типу File а не FileData


    public void remove(String path) {
        fileMap.remove(path);
    }


}
