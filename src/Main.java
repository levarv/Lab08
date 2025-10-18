import java.util.LinkedList;

/**
 * Title: Lab 08
 * Date: 20251017
 * @author Ronald
 */


public class Main {
    public static void main(String[] args) {

        //linked list created, numbers up to n added
        SgLinkedList list = new SgLinkedList();
        int n = 2;
        for (int i = 2; i <= n ; ++i) {
            if (primeCheck(i))
                list.add(i);
        }

        //entries screened for a "3 * 10^(0)", a 3 in the "1's" place.
        //entries added to list2
        int numerator = 0;
        SgLinkedList list2 = new SgLinkedList();

        while (list.hasNext()) {
            numerator = list.remove();
            if (numerator % 10 == 3)
                list2.add(numerator);
        }

        // ∑(list2)
        int sum = 0; 
        while (list2.hasNext())
            sum += list2.remove();

        System.out.println(sum);
    }

    //prime detection of 'n' via Trial division
    public static boolean primeCheck(int n){
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}