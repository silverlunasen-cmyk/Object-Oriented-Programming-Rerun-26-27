package Fundementals.Exercise1;

public class Book
{
    private final String title;
    private final int pageCount;

    public Book(String title, int pageCount)
    {
        if(title == null)
        {
            throw new IllegalArgumentException("The book has to have a name!");
        }
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPageCount()
    {
        return pageCount;
    }

    @Override
    public String toString()
    {
        return "Title: " + getTitle() + " (" + getPageCount() + " Pages)";
    }

}
