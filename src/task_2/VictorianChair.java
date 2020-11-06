package task_2;


public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return  age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}