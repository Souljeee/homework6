public class Animal {
    private  static int count;
    private String name;

    public Animal(String name){
        this.name = name;
        count++;
    }

    public void run(int length){
        System.out.printf("%s пробежал %d метров\n", name, length);

    }

    public void swimming(int length){
        System.out.printf("%s проплыл %d метров\n", name, length);
    }

    public static int getCount() {
        return count;
    }
}
