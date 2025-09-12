package Q5;

public class File {
    private String name;
    private Folder parent;    // must belong to a folder
    private boolean isDeleted = false;

    public File(String name) {
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

    public void delete() {
        if (parent == null) throw new IllegalStateException("File '" + name + "' does not belong to any folder.");
        //parent.removeFile(this);
        parent = null;
        isDeleted = true;
    }

    public void print(String indent) {
        if (isDeleted) throw new IllegalStateException("File '" + name + "' has been deleted.");
        System.out.println(indent + "/- " + name);
    }
}
