public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //
    }

    class Node{
        String name;
        Node left;
        Node right;

        Node(String name){
            this.name = name;
            left = null;
            right = null;
        }
    }
}