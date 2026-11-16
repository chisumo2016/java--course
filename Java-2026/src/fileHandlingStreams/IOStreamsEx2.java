package fileHandlingStreams;

import java.io.File;
import java.io.FilenameFilter;

class FileUtils{
    public static void display(File[]  files){
        for (File file : files){
            System.out.println(file.getName());
        }
    }
}
public class IOStreamsEx2 {

    public static void main(String[] args) {

        File baseDirectory = new File("/Users/developer/Documents/java/Java-2026");
        //RETURN THE ARRAY OF FILES
        File[] files = baseDirectory.listFiles();
        FileUtils.display(files);

        System.out.println();

        //FILTER OUT
        System.out.println("Only Java Files");
        File[] javaFiles = baseDirectory.listFiles(new JavaFileFilter());
        FileUtils.display(javaFiles);

//        for (File file : files){
//            if (file.getName().endsWith(".java")){
//                System.out.println(file.getName());
//            }
//        }
    }

}

class JavaFileFilter implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {

        return name.endsWith(".java");
    }
}
