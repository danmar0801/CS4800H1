import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Folder> subFolders = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeFolder(Folder folder) {
        subFolders.remove(folder);
    }

    public void print(String indentation) {
        System.out.println(indentation + name);
        for (Folder folder : subFolders) {
            folder.print(indentation + "  "); // Recursively print sub-folders with added indentation
        }
        for (File file : files) {
            file.print(indentation + "  "); // Print files with indentation
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(List<Folder> subFolders) {
        this.subFolders = subFolders;
    }
}
