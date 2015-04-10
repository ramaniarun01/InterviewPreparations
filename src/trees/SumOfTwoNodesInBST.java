package trees;

import java.util.Hashtable;
import java.util.Iterator;

public class SumOfTwoNodesInBST {
    static Hashtable<Integer, Integer> myTable = new Hashtable<Integer, Integer>();
    public static final int SUM = 150;

    public void PrintNodesToAHashTable(Node n) {

        if (n == null) {
            return;
        } else {
            PrintNodesToAHashTable(n.left);
            if ((Integer) n.value < SUM) {
                System.out.println(n.value);
                myTable.put((Integer) n.value, 1);
            }
            PrintNodesToAHashTable(n.right);
        }
    }

    public void printCombo(Hashtable<Integer, Integer> myTable) {
        Iterator<Integer> i = myTable.keySet().iterator();
        int lookUpKey = 0;
        while (i.hasNext()) {
            int currentKey = i.next();
            lookUpKey = SUM - currentKey;
            if (myTable.containsKey(lookUpKey)) {
                System.out.println("Combo found " + currentKey + " + "
                        + lookUpKey + " = " + SUM);
            }
        }
    }

    public static void main(String args[]) {
        SumOfTwoNodesInBST sum = new SumOfTwoNodesInBST();

        Node n = new Node(new Integer(100));
        n.left = new Node(new Integer(70));
        n.right = new Node(new Integer(120));

        n.left.left = new Node(new Integer(50));
        n.left.right = new Node(new Integer(80));

        n.right.left = new Node(new Integer(110));
        n.right.right = new Node(new Integer(130));

        sum.PrintNodesToAHashTable(n);
        sum.printCombo(myTable);
    }

}
