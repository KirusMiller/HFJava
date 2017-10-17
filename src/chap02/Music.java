package chap02;

public abstract class Music {

        String title;
        String genre;
       abstract void play();


    public static void main(String[] args){

        Song1 s1 = new Song1();
        Song2 s2 = new Song2();
        Song3 s3 = new Song3();

        System.out.println(s1.title);
        s1.play();
        System.out.println(s2.title);
        s2.play();
        System.out.println(s3.title);
        s3.play();
    }

}
