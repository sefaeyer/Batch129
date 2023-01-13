package day24accessmodifiersinheritiance;

import day23datetimestringbuilder.Snake;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnike = new Snake();
        yourSnike.tiss();
        yourSnike.eat();


    }
}
