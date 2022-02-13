package abst;

public class Main extends Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeNoise();
        dog.ove();
        dog.wagTail();
        dog.fetth();

        Canine canine = new Dog();
        canine.makeNoise();
        canine.ove();
        canine.wagTail();
//        canine.fetth();
//
//        Animal animal = new Dog();
//        animal.makeNoise();
//        animal.ove();
//        animal.wagTail();
//        animal.fetth();

        Number num= Math.PI;
        double d= Math.PI;
    }
}
