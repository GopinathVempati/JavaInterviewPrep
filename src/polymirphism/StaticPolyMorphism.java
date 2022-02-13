package polymirphism;

public class StaticPolyMorphism {
    /*StaticPolyMorphism also known as Method overloading*/

    public static void main(String[] args){
     sayHello();
     sayHello(2);

    }

    private static void sayHello() {
        System.out.println("hello");
    }

    private static void sayHello(int num) {
        System.out.println(num);
    }
}
