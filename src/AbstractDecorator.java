public abstract class AbstractDecorator implements Holiday {

    Holiday decoratedTree;

    //Конструктор, принимающий объект Shape
    public AbstractDecorator(Holiday decoratedShape) {
        this.decoratedTree = decoratedShape;
    }

    public void draw() {
        decoratedTree.draw();
    }
}