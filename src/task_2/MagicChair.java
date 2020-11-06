package task_2;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Doing magic...");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}