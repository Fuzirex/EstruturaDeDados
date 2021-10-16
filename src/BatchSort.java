import utils.FileUtils;
import utils.SimpleReader;
import utils.SimpleWriter;
import utils.SortUtils;

import java.util.ArrayList;

public class BatchSort {

    public static void main(String[] args) {

        Integer[] numbers1 = FileUtils.getInstance().readFile("numbers-1.txt");
        Integer[] numbers2 = FileUtils.getInstance().readFile("numbers-2.txt");

        SortUtils.getInstance().quickSort(numbers1, 0, numbers1.length - 1);
        SortUtils.getInstance().quickSort(numbers2, 0, numbers1.length - 1);

        FileUtils.getInstance().writeFile(numbers1, "partial-1.txt");
        FileUtils.getInstance().writeFile(numbers2, "partial-2.txt");
    }

}