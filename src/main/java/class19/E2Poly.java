package class19;

public class E2Poly {

    public static void main(String[] args) {
        Dog d1=new Dog("jack","blak", 12,13);
        Dog d2=new Dog("jack","blak", 12,12);
        Cat c1=new Cat("jack","blak", 12,12);

        Animal [] arr={d1, d2, c1};

        Animal a2=arr[0];
        a2.printInfo();
    }
}
