
public class SearchProject
{
    /**
     * Call this to test your methods for correctness.
     */
    public static void tester() {
        String[] s = {"apple", "banana", "carrot", "kiwi", "lemon", "melon"};
        Fraction[] f = {new Fraction(3, 10), new Fraction(7, 8), new Fraction(9, 5), new Fraction(13, 4), new Fraction(20, 3)};
        
        System.out.println("Tester code for linearSearch");
        System.out.println("Should be 1: " + linearSearch(s, "banana"));
        System.out.println("Should be 4: " + linearSearch(s, "lemon"));
        System.out.println("Should be -1: " + linearSearch(s, "grape"));
        
        System.out.println("Should be 0: " + linearSearch(f, new Fraction(3, 10)));
        System.out.println("Should be 2: " + linearSearch(f, new Fraction(9, 5)));
        System.out.println("Should be -1: " + linearSearch(f, new Fraction(1, 2)));
        
        System.out.println();
        System.out.println();
        
        System.out.println("Tester code for binarySearch");
        System.out.println("Should be 1: " + binarySearch(s, "banana"));
        System.out.println("Should be 4: " + binarySearch(s, "lemon"));
        System.out.println("Should be -1: " + binarySearch(s, "grape"));
        System.out.println("Should be -1: " + binarySearch(s, "acai berry"));
        System.out.println("Should be -1: " + binarySearch(s, "watermelon"));
        
        System.out.println("Should be 0: " + binarySearch(f, new Fraction(3, 10)));
        System.out.println("Should be 2: " + binarySearch(f, new Fraction(9, 5)));
        System.out.println("Should be -1: " + binarySearch(f, new Fraction(1, 2)));
        System.out.println("Should be -1: " + binarySearch(f, new Fraction(1, 9)));
        System.out.println("Should be -1: " + binarySearch(f, new Fraction(50, 7)));
        
        System.out.println();
        System.out.println();

    }
    
    /**
     * Call this to time your methods. You should find that binary search is faster than linear
     * search, especially for large arrays.
     * 
     * We can use the same methods because Integer implements Comparable<Integer>.
     */
    public static void timer() {
        int n = 1000000; // Change this to experiment.
        Integer[] a = randomArray(n);
        
        // Random target -- within the "bounds" of the array;
        // may or may not be actually found in the array.
        int target = a[0] + (int) ((Math.random() * (a[a.length - 1] - a[0])));
        
        System.out.println("Array with n = " + a.length + " from " + a[0] + " to " + a[a.length - 1]);
        System.out.println("Searching the array for the value " + target);
        
        System.out.println();
        
        long start, end;
        
        start = System.nanoTime()/1000;
        System.out.println("Linear search");
        System.out.println("Result: " + linearSearch(a, target));
        end = System.nanoTime()/1000;
        System.out.println("Time: " + (end - start) + " microseconds");
        
        System.out.println();
        
        start = System.nanoTime()/1000;
        System.out.println("Binary search");
        System.out.println("Result: " + binarySearch(a, target));
        end = System.nanoTime()/1000;
        System.out.println("Time: " + (end - start) + " microseconds");
    }
    
    /**
     * Complete this -- implements Linear Search, left to right.
     */
    public static int linearSearch(Comparable[] a, Comparable target) {
        for(int i = 0; i < a.length; i++) {
            if(a[i].compareTo(target) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Complete this -- implements Binary Search.
     */
    public static int binarySearch(Comparable[] a, Comparable target) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left+right)/2;
            if(a[mid].compareTo(target) == 0) {
                return mid;
            }
            else if(a[mid].compareTo(target) < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    /**
     * Returns a sorted array of n random Integers.
     */
    private static Integer[] randomArray(int n) {
        Integer[] a = new Integer[n];
        int x = 0;
        for(int i = 0; i < a.length; i++) {
            x += (int)(10 * Math.random() + 1);
            a[i] = new Integer(x);
        }
        return a;
    }
}
