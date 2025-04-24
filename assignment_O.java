// Jvdroid-main: main

//SINGLE INHERITANCE
class Student {
    public void act() {
        System.out.println("Students write exams");
            }
}

class Ife extends Student {
    public void studies() {
        System.out.println("Ife studies");
    }
}

//MULTI LEVEL INHERITANCE
class Animals {
    public void sleep() {
        System.out.println("Animal sleeps");
            }
}

class Koala extends Animals {
    public void eats() {
        System.out.println("Koala eats");
    }
}

class Snake extends Koala {
    public void hiss() {
        System.out.println("Snake hisses");
    }
}

//Heirachical Inheritance
class Group {
    public void LMU() {
        System.out.println("All are studying at Landmark");
            }
}

class Firstyear extends Group {
    public void matriculating() {
        System.out.println("100 level students");
    }
}

class Finalyear extends Group {
    public void Convocating() {
        System.out.println("400 or 500 level students");
    }
}

//Multiple Inheritance
//Java does not support multiples inheritance