import java.util.Comparator;

public class SortByName implements Comparator<Brand>
{
    public int compare(Brand a, Brand b)
    {
        return a.getBrandName().compareTo(b.getBrandName());
    }
}