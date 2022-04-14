import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class AddPackage {
    public static void main(String[] args) throws Exception {
        
        //Check argument
        if(args.length != 1) {
            System.out.println("Usage java Exercise12_18 srcRootDirectory");
            System.exit(1);
        }

        //check file object is directory
        File rootDir = new File(args[0]);
        if(!rootDir.isDirectory()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }

        //create list of directories
        ArrayList<File> chapters = getDirectories(rootDir);

        while(!chapters.isEmpty()) {
            //Create array of chapter files
            ArrayList<File> files = getFiles(chapters);

            insertStatement(files, chapters.get(0));
        }
    }    

    public static ArrayList<File> getDirectories(File rootDir) {
        ArrayList<File> directories = new ArrayList<>();
        for(int i = 1; i < 8; i++) {
            directories.add(new File(rootDir, "chapter"+i));
        }

        return directories;
    }

    public static ArrayList<File> getFiles(ArrayList<File> chapters) {
        if(!chapters.get(0).isDirectory()) {
            System.exit(0);
        }

        ArrayList<File> list = new ArrayList<>(Arrays.asList(chapters.get(0).listFiles()));

        filterJavaFiles(list);

        return list;
    }

    public static void filterJavaFiles(ArrayList<File> list) {
        for(int i = 0; i < list.size(); i++) {
            String str = list.get(i).getName();
            boolean isjavacode = str.substring(str.lastIndexOf('.')).equals(".java");
            if(!isjavacode) {
                list.remove(i);
            }
        }
    }

    public static void insertStatement(ArrayList<File> list, File dir) throws Exception {
        for(int i = 0; i < list.size(); i++) {
            ArrayList<String> lines = new ArrayList<>();
            lines.add("package " +dir.getName()+ ";");

            try( Scanner input = new Scanner(list.get(i))) {
                while(input.hasNext()) {
                    lines.add(input.nextLine());
                }
            }

            try (PrintWriter output = new PrintWriter(list.get(i))) {
                for(int j = 0; j < lines.size(); j++) {
                    output.println(lines.get(j));
                }
            }
        }
    }
}
