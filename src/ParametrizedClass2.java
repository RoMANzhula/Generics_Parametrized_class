public class ParametrizedClass2 {
    public static void main(String[] args) {
        PairValue<String, Integer> example = new PairValue<>("Dog", 5);
        System.out.println("We have next value for our object: value1 is Name = " + example.getValue1() +
                ", value2 is Age = " + example.getValue2());

        OneTypeValue<String> example2 = new OneTypeValue<>("Dog", "five");
        System.out.println("We have next value for our object: value1 is Name = " + example2.getValue1() +
                ", value2 is Age = " + example2.getValue2());
    }
}

class PairValue <T1, T2> { //параметризуємо наш клас двома РІЗНИМИ типами дженериків
    private T1 value1;
    private T2 value2;

    public PairValue(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }
}

class OneTypeValue <T> { //параметризуємо наш клас двома однаковими типами дженериків у конструкторі класу
    private T value1;
    private T value2;

    public OneTypeValue(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }
}

