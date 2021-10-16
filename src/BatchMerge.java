import utils.FileUtils;
import utils.SimpleReader;
import utils.SimpleWriter;

public class BatchMerge {

    public static void main(String[] args) {

        SimpleReader p1 = new SimpleReader("./src/resources/out/partial-1.txt");
        SimpleReader p2 = new SimpleReader("./src/resources/out/partial-2.txt");

        SimpleWriter sw = new SimpleWriter("./src/resources/out/sorted.txt");

        String v1 = p1.readLine();
        String v2 = p2.readLine();

        while(v1 != null || v2 != null) {
            if((v1 != null && v2 != null && Integer.parseInt(v1) < Integer.parseInt(v2)) || v2 == null) {
                sw.write(v1);
                v1 = p1.readLine();

            } else {
                sw.write(v2);
                v2 = p2.readLine();
            }
        }

        p1.close();
        p2.close();
        sw.close();

    }

}