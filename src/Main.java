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
        int n = 30;
        for (int i = 2; i <= n ; ++i) {
            if (primeCheck(i))
                list.add(i);
        }

        //entries screened for a "3"
        //I couldn't think of a cool numeric way to do this :/
        int numerator = 0;
        SgLinkedList list2 = new SgLinkedList();

        while (list.hasNext()) {
            numerator = list.remove();
                if(String.valueOf(numerator).contains("3"))
                    list2.add(numerator);
            }

        // ∑(list2), completion of the lab process
        int sum = 0; 
        while (list2.hasNext())
            sum += list2.remove();
        System.out.println(sum);
    }

    /**
     * primeCheck</p>
     * prime detection of 'n' via Trial division
     * @param n number to be checked
     * @return true if prime/ else false
     */
    public static boolean primeCheck(int n){
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}