package abst;

public abstract class Canine extends Animal{

    public void wagTail(){
        System.out.println("Wagging");
    }

    @Override
    public void ove() {
        System.out.println("RUn");
    }
}
