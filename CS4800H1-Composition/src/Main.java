public class Main {
    public static void main(String[] args) {
        // Create folders
        Folder root = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder models = new Folder("models");
        Folder library = new Folder("library");
        Folder migration = new Folder("migration");
        Folder views = new Folder("views");
        Folder publicFolder = new Folder("public");
        Folder cache = new Folder("cache");
        Folder IncludePath = new Folder("Include Path");
        Folder RemoteFiles = new Folder("Remote Files");

        // Add sub-folders to app
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migration);
        app.addFolder(models);
        app.addFolder(views);

        // Add files to public
        publicFolder.addFile(new File("index.html"));
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File("router.php"));

        // Add sub-folders to root
        root.addFolder(sourceFiles);
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);



        // add other files to root
        root.addFolder(IncludePath);
        root.addFolder(RemoteFiles);

        // Print out the structure
        // Print out the structure with initial indentation
        System.out.println("Full Structure:");
        root.print("");

        // Remove app folder and print out the structure again
        System.out.println("\nAfter deleting app folder:");
        sourceFiles.removeFolder(app);
        root.print("");

        // Remove public folder and print out the structure again
        System.out.println("\nAfter deleting public folder:");
        sourceFiles.removeFolder(publicFolder);
        root.print("");
    }
}