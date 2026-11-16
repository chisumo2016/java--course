package InterpolationSearch;
/*
  Interpolation search : Improvement  over binary search for "uniformly" distributed data "guessses" where a value be based on
  calculated probe results .If probe is incorrect, search area is narrowed, and a new probe is calculated.

        average case complexity O(log(log(n)))

        worst case complexity O(n) [values increase exponentially]

        If the probe is incorrect, the search area is narrowed, and a new probe is calculated.
 */
public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int index = interpolationSearch(array, 8);

        if (index != -1){
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found :");
        }


    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low  = 0;

        while(value >= array[low] && value <= array[high] && low <= high){
            //value to be
            int probe = (high -low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println("probe : " + probe);
            
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
