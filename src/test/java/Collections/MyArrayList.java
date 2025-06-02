package Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {

        String str1 = "qwerty";
        for (int i = 0; i < str1.length(); i++) {
            String modified
                    = //str1.substring(0, i);
                     str1.substring(i + 1);
            System.out.println(modified);
        }

}
}
