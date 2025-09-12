package Q5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Folder {
    private static final String INDENT_SPACE_STRING = "    "; // for indentation in the File System printout
    private String name;
    private Folder parent;    // null if this is the root folder
    private List<Folder> subFolders = new ArrayList<>();
    private List<File> files = new ArrayList<>();
    private boolean isDeleted = false;

    public Folder(String name) {
        this.name = name;
    }
    // Getters / Setters (accessors / mutators)
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public Folder getParentFolder() { return parent; }
    public void setParentFolder(Folder parent) {
        this.parent = parent;
    }

    /* 
    *    Helper methods for managing subfolders and files
    */ 
    public List<Folder> getSubFolders() {
        return Collections.unmodifiableList(subFolders);
    }
    // to add an existing subfolder to this folder
    public Folder addSubFolder(Folder folder) {
        DeletionCheck();
        subFolders.add(folder);
        folder.parent = this;
        return folder;
    }
    // to create new subfolder
    public Folder createSubFolder(String name) {
        return addSubFolder(new Folder(name));
    }

    public List<File> getFiles() {
        return Collections.unmodifiableList(files);
    }

    // to add an existing file to this folder
    public File addFile(File file) {
        DeletionCheck();
        files.add(file);
        file.setParentFolder(this);
        return file;
    }
    // to create new file in this folder
    public File createFile(String name) {
        return addFile(new File(name));
    }    

    // Recursively delete this folder and all its contents
    public void delete() {
        // delete all subfolders
        for (Folder folder : new ArrayList<>(subFolders)) {
            folder.delete();
        }
        subFolders.clear();
        // delete all files
        for (File file : new ArrayList<>(files)) {
            file.delete();
        }
        files.clear();
        // remove this folder from its parent
        if (parent != null) {
            parent.subFolders.remove(this);
            parent = null;
        }
        isDeleted = true;
    }

    // Search for a subfolder by name within a subfolder (recursively)
    public Folder findSubFolderByName(String name) {
        DeletionCheck();
        if (this.getName().equals(name)) {
                return this;
        }
        for (Folder folder : subFolders) {
            Folder found = folder.findSubFolderByName(name);
            if (found != null) {
                return found;
            }
        }
        return null; // not found
    }

    public void DeletionCheck() {
        if (isDeleted) throw new IllegalStateException("Folder '" + name + "' has been deleted.");
    }

    // Print the folder structure recursively
    public void print() {
        printFolderTree("");
    }
    public void printFolderTree(String indent) {
        DeletionCheck();
        System.out.println(indent + "/+ " + name);
        String newIndent = indent + INDENT_SPACE_STRING;
        for (Folder folder : subFolders) {
            folder.printFolderTree(newIndent);
        }
        for (File file : files) {
            file.print(newIndent);
        }
    }
    
}
