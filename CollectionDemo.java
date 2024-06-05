import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println("ArrayList: " + arrayList);

        // 2. LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        System.out.println("LinkedList: " + linkedList);

        // 3. HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet: " + hashSet);

        // 4. TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Cat");
        treeSet.add("Dog");
        treeSet.add("Elephant");
        System.out.println("TreeSet: " + treeSet);

        // 5. HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // 6. TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "First");
        treeMap.put(2, "Second");
        treeMap.put(3, "Third");
        System.out.println("TreeMap: " + treeMap);

        // 7. LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Monday");
        linkedHashMap.put(2, "Tuesday");
        linkedHashMap.put(3, "Wednesday");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // 8. Queue (using LinkedList)
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Alice");
        queue.add("Bob");
        System.out.println("Queue: " + queue);

        // 9. PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(10);
        System.out.println("PriorityQueue: " + priorityQueue);

        // 10. Stack
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println("Stack: " + stack);

        // 11. ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.add("Orange");
        System.out.println("ArrayDeque: " + arrayDeque);

        // 12. EnumSet
        Set<Days> enumSet = EnumSet.of(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY);
        System.out.println("EnumSet: " + enumSet);

        // 13. BitSet
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(2);
        bitSet.set(4);
        System.out.println("BitSet: " + bitSet);

        // 14. Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "January");
        hashtable.put(2, "February");
        hashtable.put(3, "March");
        System.out.println("Hashtable: " + hashtable);

        // 15. Properties
        Properties properties = new Properties();
        properties.setProperty("name", "John");
        properties.setProperty("age", "30");
        properties.setProperty("city", "New York");
        System.out.println("Properties: " + properties);

        // 16. Vector
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");
        System.out.println("Vector: " + vector);

        // 17. Enumeration (for Vector)
        Enumeration<String> enumeration = vector.elements();
        System.out.print("Vector elements: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // 18. ListIterator (for ArrayList)
        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.print("ArrayList elements (forward): ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        // 19. Iterator (for HashSet)
        Iterator<String> iterator = hashSet.iterator();
        System.out.print("HashSet elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 20. ArrayBlockingQueue
        BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        try {
            arrayBlockingQueue.put(10);
            arrayBlockingQueue.put(20);
            arrayBlockingQueue.put(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);
    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY
}
