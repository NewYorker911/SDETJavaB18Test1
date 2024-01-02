package review9;

public interface WashAble {

    void wash();
}
interface TrustAble{
    void trust();
}


class Horse implements WashAble, TrustAble{
    @Override
    public void wash() {
        System.out.println("Washing a Horse");
    }

    @Override
    public void trust() {
        System.out.println("Horse can be trusted they are loyal");
    }
}

class Car implements WashAble, TrustAble{

    @Override
    public void trust() {
        System.out.println("You can trust Toyota cars");
    }

    public void wash(){
        System.out.println("Washing a Car");

    }

}

class Laptop{

}
