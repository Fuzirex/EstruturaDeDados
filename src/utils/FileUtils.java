package utils;

import java.io.File;
import java.util.ArrayList;

public class FileUtils {

    private static FileUtils INSTANCE;

    public void writeFile(Integer[] list, String filename) {
        SimpleWriter sw = new SimpleWriter("./src/resources/out/" + filename);

        for (Integer valor : list)
            sw.write(valor.toString());

        sw.close();
    }

    public Integer[] readFile(String filename) {
        SimpleReader sr = new SimpleReader("./src/resources/in/" + filename);

        String valor = sr.readLine();
        ArrayList<Integer> list = new ArrayList<>();

        while(valor != null) {
            list.add(Integer.valueOf(valor));
            valor = sr.readLine();
        }

        sr.close();

        return list.toArray(new Integer[list.size()]);
    }


    public static FileUtils getInstance() {
        if(INSTANCE == null)
            INSTANCE = new FileUtils();

        return INSTANCE;
    }
}