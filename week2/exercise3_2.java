import java.math.BigDecimal;
import java.math.MathContext;

public class exercise3_2 {
    private linkedlistlong eratosthenes(BigDecimal n) {
        linkedlistlong mylist = new linkedlistlong();
        MathContext mc = new MathContext(2);
        for (BigDecimal i = BigDecimal.TWO; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            mylist.insert(mylist, BigDecimal.ONE);
        }

        linkedlistlong.Node thisElement = mylist.head;
        linkedlistlong.Node thisElement2;

        for (BigDecimal i = BigDecimal.TWO; i.compareTo((n.sqrt(mc)).add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal thisElementData = thisElement.data;
            if (thisElementData.compareTo(BigDecimal.ONE) == 0) {
                thisElement2 = thisElement;

                if ((n.remainder(i)).compareTo(BigDecimal.ZERO) == 0) {
                    for (BigDecimal j = i.multiply(i); j.compareTo((n.add(BigDecimal.ONE))) <= 0; j = j.add(i)) {
                        for (BigDecimal k = BigDecimal.ZERO; k.compareTo(i) < 0; k = k.add(BigDecimal.ONE)) {
                            thisElement2 = thisElement2.next;
                        }
                        thisElement2.data = BigDecimal.ZERO;
                    }
                }
                else {
                    for (BigDecimal j = i; j.compareTo((n.add(BigDecimal.ONE)).subtract(i)) < 0; j = j.add(i)) {
                        for (BigDecimal k = BigDecimal.ZERO; k.compareTo(i) < 0; k = k.add(BigDecimal.ONE)) {
                            thisElement2 = thisElement2.next;
                        }
                        thisElement2.data = BigDecimal.ZERO;
                    }
                }
            }
            thisElement = thisElement.next;
        }
        return mylist;
    }
    public void process() {
        long num = (long) Math.pow(2, 6);
        BigDecimal numnew = new BigDecimal(num);
        linkedlistlong.printList(eratosthenes(numnew));
    }
    public static void main(final String[] args) {
        new exercise3_2().process();
    }
}
