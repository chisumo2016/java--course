package InterpolationSearch;

public class Demo {

    public static void main(String[] args) {

        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};

        int index = interpolationSearch(array, 256);

        if (index != -1){
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found");
        }


    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low  = 0;

        while(value >= array[low] && value <= array[high] && low <= high){
            //value to be
            int probe = (high -low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe :" + probe);

            if (probe == value){
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
