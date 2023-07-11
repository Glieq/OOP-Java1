// Базовый класс Животное
public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();

    public abstract void eat(int foodAmount);
}

// Класс Пес
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public void eat(int foodAmount) {
        System.out.println(getName() + " поел " + foodAmount + " грамм корма.");
    }

    public void fetch() {
        System.out.println(getName() + " принеси палку!");
    }
}

// Класс Кот
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }

    @Override
    public void eat(int foodAmount) {
        System.out.println(getName() + " съел " + foodAmount + " грамм рыбы.");
    }

    public void scratch() {
        System.out.println(getName() + " подрал обои!");
    }
}

// Пример использования классов
class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Шарик", 3);
        animals[1] = new Cat("Мурзик", 5);
        animals[2] = new Dog("Рекс", 2);
        animals[3] = new Cat("Барсик", 4);

        for (Animal animal : animals) {
            animal.eat(200); // Каждое животное съедает 200 грамм пищи
            animal.makeSound(); // Каждое животное подает голос
            System.out.println();
        }
    }
}
