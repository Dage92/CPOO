import java.util.*;
import java.lang.*;

public abstract class Component
{
    protected String name;
    protected int size;
    protected ArrayList tree;
    
    public Component(String name, int size)
    {
        this.name = name;
        this.size = size;
        this.tree = new ArrayList();
    }
    
    public void displayTree()
    {
    }
}