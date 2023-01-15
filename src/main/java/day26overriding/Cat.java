package day26overriding;

public class Cat extends Mammals {

    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override //Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
    public void eat() { // Child daki override edilmis method eat methoduna Overriding method denir
        System.out.println("Cats eat...!");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...!");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}
