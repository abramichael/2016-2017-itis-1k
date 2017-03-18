/**
 * Created by ma on 16.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyCollection<String> tree = new BinaryTreeCollection<>();
        tree.add("Vlad K.");
        tree.add("Semen");
        tree.add("Vlad T.");
        tree.printTree();
        System.out.println();
        tree.add("Max");
        tree.add("Timur M.");
        tree.add("Sonya");
        tree.printTree();
        System.out.println();
        tree.add("Iliya M");
        tree.add("Mark");
        tree.add("Timur I.");
        tree.printTree();
        System.out.println();
        tree.add("Robert");
        tree.add("Nikita");
        tree.add("Bulat");
        tree.add("Aliya");
        tree.printTree();
        System.out.println();
    }
}
