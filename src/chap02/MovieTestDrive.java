package chap02;

public class MovieTestDrive {
    public static void main(String[] args){
        Movie one = new Movie();
        Movie two = new Movie();
        Movie three = new Movie();

        one.title = "Hello World";
        two.title = "It's me";
        three.title = "Mario!";

        one.genre = "Dramma";
        two.genre = "Comedy";
        three.genre = "Criminal";

        one.rating = 1;
        two.rating = 2;
        three.rating = 3;
    }
}
