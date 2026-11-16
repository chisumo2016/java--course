package searchArray;

public class fruits {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "orange", "grape"};
        String target = "grape";
        boolean isFound = false;

        //lineae search
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Element not found is the array");
        }
    }
}
