package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AsListUse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  String str[]=new String[]{"shiva,ayush,raju,kira"};
        String str="shiva";

        List<String> list= Arrays.asList(str);
        System.out.println("Strign is converted into list:"+list);

    }
}
