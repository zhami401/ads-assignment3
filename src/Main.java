import java.util.Random;

public class Main {
    public static void main(String[] args) {


        MyHashTable<Student, String> table = new MyHashTable<>(11);

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            Student s = new Student(rand.nextInt(10000), "Name" + i);
            table.put(s, "Value" + i);
        }

        System.out.println("Size: " + table.size());

        BST<Integer, String> tree = new BST<>();

        tree.put(5, "A");
        tree.put(2, "B");
        tree.put(8, "C");

        for (var elem : tree) {
            System.out.println("key: " + elem.getKey() +
                    " value: " + elem.getValue());
        }
    }
}

