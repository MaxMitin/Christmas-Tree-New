public class Main {
    public static void main(String[] args) {

        Holiday Tree = new ChristmasTree();
        Holiday cToys= new Decorator(new ChristmasTree());

        System.out.println(" ");
        Tree.draw();

        System.out.println(" ");
        cToys.draw();
    }
}