package MyPackage;

import java.util.Arrays;

public class Master {
    public static void main(String[] args) {


        String[][] fruits = { {"cherry", "Watermelon", "Fig"},
                {"Banana", "Apples"},
                {"Pinaples"}};
// Regular for loop
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(Arrays.toString(fruits[i]));
            for(int j = 0; j < fruits[i].length; j++) {
                System.out.println(fruits[i][j]);
            }
        }







    }


}





