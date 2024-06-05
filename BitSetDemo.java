import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);

        System.out.println("BitSet: " + bitSet);

        // Removing an element (not applicable in BitSet)
        // Iterating over elements
        System.out.print("Iterating over elements: ");
        for (int i = 0; i < bitSet.length(); i++) {
            if (bitSet.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
