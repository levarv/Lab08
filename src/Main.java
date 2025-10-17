  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //linked list created, numbers up to n added
        SgLinkedList list = new SgLinkedList();
        int n = 1000;
        for (int i = 2; i < n; ++i) {
            if (primeCheck(i))
                list.insert(i);
        }

        //entries screened for a "3 * 10^(0)", a 3 in the "1's" place.
        //entries added to list2
        int numerator = 0;
        SgLinkedList list2 = new SgLinkedList();

        while (list.hasNext()) {
            numerator = list.pop();
            if (numerator % 10 == 3)
                list2.insert(numerator);
        }

        // ∑(list2)
        int sum = 0;
        while (list2.hasNext())
            sum += list2.pop();

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