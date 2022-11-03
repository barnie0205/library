package library.io.file;

import library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}