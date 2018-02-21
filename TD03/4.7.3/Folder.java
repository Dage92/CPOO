public class Folder extends Component
{
    public Folder(String name, int size)
    {
        super(name, size);
    }
    
    public String getName()
    {
        return super.name;
    }
    
    public String getSize()
    {
        return super.size;
    }
    
    public void add(File file)
    {
        tree.add(file);
    }
    
    public void delete(File file)
    {
        tree.remove(file);
    }
    
    public void displayParent()
    {
        
    }
    
    public void displayChildren()
    {
        
    }
}