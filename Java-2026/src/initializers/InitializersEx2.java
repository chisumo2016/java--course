package initializers;

import java.util.Properties;

class Config{  // class will loaded into memory once

    static Properties properties;

    static {
        System.out.println("Loading the properties from configuration file");

        properties = new Properties();
    }

}

class  DatabaseDriver{

    static {
        System.out.println("Loading the database driver");
    }

}


public class InitializersEx2 {

    public static void main(String[] args) {

    }
}
