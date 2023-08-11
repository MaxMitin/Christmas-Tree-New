public class Decorator extends AbstractDecorator
{

    public Decorator(Holiday decoratedTree)
    {
        super(decoratedTree);
    }

    @Override
    public void draw()
    {
        decoratedTree.draw();
        firstToys(decoratedTree);
        garlands(decoratedTree);
        toys(decoratedTree);
    }

    private void firstToys(Holiday decoratedTree)
    {
        System.out.println("На ёлочке - новогодние игрушки-украшения.");
    }

    private void garlands(Holiday decoratedTree)
    {
        System.out.println("А ещё на ёлочке - новогодние гирлянды.");
    }

    private void toys(Holiday decoratedTree)
    {
        System.out.println("А под ёлочкой - новогодние подарки!");
    }
}