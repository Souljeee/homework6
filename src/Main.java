public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        dog.swimming(5);
        dog.swimming(30);
        dog.run(100);
        dog.run(600);
        cat.swimming(100);
        cat.run(140);
        cat.run(250);


        //подсчет количества объектов
        System.out.println();
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Мурзик");
        Cat cat4 = new Cat("Мурзик");
        Cat cat5 = new Cat("Мурзик");
        Cat cat6 = new Cat("Мурзик");
        Cat cat7 = new Cat("Мурзик");
        Cat cat8 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Бобик");
        Dog dog3 = new Dog("Бобик");
        Dog dog4 = new Dog("Бобик");
        Dog dog5 = new Dog("Бобик");
        Dog dog6 = new Dog("Бобик");
        Dog dog7 = new Dog("Бобик");
        Dog dog8 = new Dog("Бобик");
        Animal animal = new Animal("Hamster");
        Animal animal1 = new Animal("Lion");
        Animal animal2 = new Animal("Tiger");
        Animal animal3 = new Animal("Bat");
        Animal animal4 = new Animal("Snake");
        Animal animal5 = new Animal("Bird");
        System.out.println("Количество котов: "+Cat.getCountCat());
        System.out.println("Количество Собак: "+ Dog.getCountDog());
        System.out.println("Количество животных: "+Animal.getCount());
    }
}
