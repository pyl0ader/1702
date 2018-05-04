public class TtestMovie2
{
    private static Movie2 myMovies[] = {
        new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
        new Movie2("Mulan Special Edition", 2004, "Disney"),
        new Movie2("Shrek 2", 2004, "Dreamworks"),
        new Movie2("The Incredibles", 2006, "Universal"),
        new Movie2("Nanny McPhee", 2006, "Universal"),
        new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman"),
        new Movie2("Ice Age", 2002, "20th Century Fox"),
        new Movie2("Lilo and Stich", 2002, "Disney"),
        new Movie2("Robots", 2005, "20th Century Fox"),
        new Movie2("Monsters Inc.", 2001, "Pixar")
    };

    public static void main(String args[])
    {
        printMovies();
    }

    public static void printMovies()
    {
        for(Movie2 m: myMovies){
            System.out.println(m);
        }
    }
}
