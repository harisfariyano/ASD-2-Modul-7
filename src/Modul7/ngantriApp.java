package Modul7;
public class ngantriApp {
    public static void main(String[] args) {
        queue ngantri = new queue(10);
        ngantri.enqueue(40);
        ngantri.show();
        ngantri.enqueue(33);
        ngantri.show();
        System.out.println("data paling depan = "+ngantri.peek());
        ngantri.enqueue(60);
        ngantri.show();
        System.out.println("data yang diambil = "+ngantri.dequeue());
        ngantri.show();
        System.out.println("data yang diambil = "+ngantri.dequeue());
        ngantri.show();
        ngantri.enqueue(54);
        ngantri.show();
        System.out.println("data paling depan = "+ngantri.peek());
    }
}