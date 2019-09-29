package Praktikum;

public class DemoSinglyLinkedList {
    public static void printListDouble(SinglyLinkedList<Double> list) {
        Node<Double> temp = list.head;
        while (temp != null) {
            System.out.print(temp.getElement().doubleValue() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public static void printListCharacter(SinglyLinkedList<Character> list) {
        Node<Character> temp = list.head;
        while (temp != null) {
            System.out.print(temp.getElement().charValue() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public static void printListString(SinglyLinkedList<String> list) {
        Node<String> temp = list.head;
        while (temp != null) {
            System.out.print(temp.getElement().toString() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        SinglyLinkedList<Double> list = new SinglyLinkedList<>();
        SinglyLinkedList<Character> list2 = new SinglyLinkedList<>();
        SinglyLinkedList<String> list3 = new SinglyLinkedList<>();

        System.out.println("\t\t\tDATA DOUBLE");
        list.addFirst(10D);
        System.out.println("List awal :");
        printListDouble(list);
        list.addLast(20D);
        list.addFirst(15D);
        list.addFirst(16D);
        System.out.println("Tambahkan 16.0 15.0 diawal dan 20.0 diakhir : ");
        printListDouble(list);
        list.removeLast();
        System.out.println("Hapus Elemen terakhir : ");
        printListDouble(list);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<\n");

        System.out.println("\t\t\tDATA CHARACTER");
        list2.addFirst('A');
        System.out.println("List awal : ");
        printListCharacter(list2);
        list2.addFirst('B');
        System.out.println("Tambahkan B diawal : ");
        printListCharacter(list2);
        list2.removeLast();
        list2.addFirst('C');
        list2.addFirst('D');
        System.out.println("Hapus Elemen terakhir, tambahkan D dan C diawal : ");
        printListCharacter(list2);
        list2.removeFirst();
        list2.addFirst('Z');
        list2.addFirst('Y');
        list2.addFirst('X');
        System.out.println("Hapus Elemen pertama, tambahkan X Y Z diawal : ");
        printListCharacter(list2);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<\n");

        System.out.println("\t\t\tDATA STRING");
        list3.addFirst("AUGIE");
        System.out.println("List awal : ");
        printListString(list3);
        list3.addLast("FAVOURITE");
        System.out.println("Tambahkan FAVOURITE diakhir : ");
        printListString(list3);
        list3.removeFirst();
        list3.addFirst("WINANDA");
        list3.addFirst("AUGIE");
        System.out.println("Hapus Elemen pertama, tambahkan AUGIE WINANDA diawal : ");
        printListString(list3);
    }
}
