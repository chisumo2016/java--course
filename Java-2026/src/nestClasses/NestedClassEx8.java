package nestClasses;

import java.io.File;
import java.io.FilenameFilter;

/*
   Anonymous implementation of Interface FilenameFilter
 */

class FileUtils2{
    public static void display(File[]  files){
        for (File file : files){
            System.out.println(file.getName());
        }
    }
}

public class NestedClassEx8 {

    public static void main(String[] args) {

        File baseDirectory = new File("/Users/developer/Documents/java/Java-2026");
        //RETURN THE ARRAY OF FILES
        //1: File[] javaFiles = baseDirectory.listFiles(new JavaFileFilter());

        //3: LAMBDA - > new approach this is object of the Anonymous class which implements FilenameFilter filter
        File[] javaFiles = baseDirectory.listFiles((dir , name ) ->  name.endsWith(".java"));
        FileUtils2.display(javaFiles);

    }
}


//File[] javaFiles = baseDirectory.listFiles(new FilenameFilter(){
//
//    @Override
//    public boolean accept(File dir, String name) {
//        return name.endsWith(".java");
//    }
//
//});