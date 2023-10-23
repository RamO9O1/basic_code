import jva.util.*;
import java.io.*;

import java.util.*;
import java.io.*;

public class Properties_Map {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);
        String s = p.getProperty("Ram");
        System.out.println(s);
        p.setProperty("Menka", "10264");
        FileOutputStream fos = new FileOutputStream("abc.properties");
        p.store(fos, "update by early");
    }
}
