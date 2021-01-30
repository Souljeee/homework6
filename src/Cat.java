public class Cat extends Animal {
    private  static int countCat;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int length) {
        if(length <= 200){
            super.run(length);
        }else{
            System.out.print("Я не смогу столько пробежать!\n");
        }
    }

    @Override
    public void swimming(int length) {
        System.out.print("Я не умею плавать!\n");
    }

    public static int getCountCat() {
        return countCat;
    }
}
