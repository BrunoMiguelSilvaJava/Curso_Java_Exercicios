package school;

/**
 * Created by Formando on 15/05/2017.
 */
public class Undergraduate extends Student{
    public static final int SMALLER_LEVEL = 1;
    public static final int GREATER_LEVEL = 4;

    private int level;

    public Undergraduate(String name, int age, int studentNumber, String schoolName, int level) {
        super(name, age, studentNumber, schoolName);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if(level >= SMALLER_LEVEL && level <= GREATER_LEVEL){
            this.level = level;
        }
        else{
            this.level = SMALLER_LEVEL;
        }
    }

    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + level);
    }

    @Override
    public void print() {
        super.print();
        System.out.println(String.format("Level: %d", this.level));
    }



}
