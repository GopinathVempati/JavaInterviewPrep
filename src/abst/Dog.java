package abst;

public class Dog extends Canine{
    @Override
    public void makeNoise() {
        System.out.println("make noise");
    }

    public void fetth(){
        System.out.println("fetch");
    }
}
