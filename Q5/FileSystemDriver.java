package Q5;

public class FileSystemDriver {
    public static void main(String[] args) {
        // Create php_demo1 file system
        Folder php_demo1 = new Folder("php_demo1");
        
        Folder source_files = php_demo1.createSubFolder("Source Files");
        source_files.createSubFolder(".phalcon");

        Folder app = source_files.createSubFolder("app");
        app.createSubFolder("config");
        app.createSubFolder("controllers");
        app.createSubFolder("library");
        app.createSubFolder("migrations");
        app.createSubFolder("models");
        app.createSubFolder("views"); 
        
        source_files.createSubFolder("cache");
        source_files.createSubFolder("public");
        //Folder publicFolder = source_files.createSubFolder("public");
        source_files.createFile(".htaccess");
        source_files.createFile(".htrouter.php");
        source_files.createFile("index.html");

        php_demo1.createSubFolder("Include Path");
        php_demo1.createSubFolder("Remote Files");

        // 1. Print php_demo1 file system
        System.out.println("---------------------------------------------------");
        System.out.println("( + ): Folder | ( - ): File");
        System.out.println("\n----'php_demo1' file system structure ---- \n");
        php_demo1.print();

        // 2. Delete the app folder and print out full structure again
        System.out.println("---------------------------------------------------");
        System.out.println("\n ---- After deleting 'app' folder ----\n");
        app.delete();
        php_demo1.print();

        // // 3. Delete the public folder and print out full structure again
        // System.out.println("---------------------------------------------------");
        // System.out.println("\nAfter deleting 'public' folder:\n");
        // publicFolder.delete();
        // php_demo1.print();

        // Extra: Search for a subfolder by name and delete it if found
        System.out.println("---------------------------------------------------");
        Folder foundFolder = php_demo1.findSubFolderByName("public");
        if (foundFolder != null) {
            foundFolder.delete();
            System.out.println("\n ---- After deleting 'public' folder ----\n");
            php_demo1.print();
        } else {
            System.out.println("\nFolder '" + foundFolder + "' not found."); 
        }


    }
}
