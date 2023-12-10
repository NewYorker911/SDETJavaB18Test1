package class15;

public class TaskForObserve {

    public TaskForObserve(){
        System.out.println("one");
    }

    private TaskForObserve(String name){
        System.out.println("Two");
    }

    TaskForObserve(int age){
        System.out.println("Three");
    }

    protected TaskForObserve(String country, double grade){
        System.out.println("Four");
    }

}
