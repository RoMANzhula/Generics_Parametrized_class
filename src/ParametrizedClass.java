public class ParametrizedClass {
    public static void main(String[] args) {
        VariableInfo<String> example1 = new VariableInfo<>("This is example #1");
        System.out.println("1.Example with String: " + example1);

        VariableInfo<Integer> example2 = new VariableInfo<>(1234);
        System.out.println("2.Example with Integer: " + example2);

        VariableInfo<Animal> example3 = new VariableInfo<>(new Animal("Cat", 4));
        System.out.println("3.Example with Object from class Animal: " + example3);
    }
}

class VariableInfo <T> { //створюємо клас з дженеріком Т - майбутній тип даних, замість якого ми будемо підставляти
    //необхідний нам тип даних (String, Integer, Object from some class) T - type placeholder (тип заповнювача)
    private T value;

    public VariableInfo(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "<<" + value + ">>";
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + " | age:" + age;
    }
}