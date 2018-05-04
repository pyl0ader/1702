public class Movie2
{
    private String title;
    private int year;
    private String studio;

    public Movie2(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    public String toString()
    {
        return String.format("%s, %d, %s",title,year,studio);
    }
}
