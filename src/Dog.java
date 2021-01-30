public class Dog extends Animal {
    private  static int countDog;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int length) {
        if(length <= 500){
            super.run(length);
        }else{
            System.out.print("Я не могу столько пробежать!\n");
        }
    }

    @Override
    public void swimming(int length) {
        if(length <= 10){
            super.swimming(length);
        }else{
            System.out.print("Это слишком много, я не смогу столько проплыть!\n");
        }
    }

    public static int getCountDog() {
        return countDog;
    }
}
