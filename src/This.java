public class This {

    public static void main(String args[]){

        ThisTest test = new ThisTest();
        System.out.println("test.age: "+test.age);
        System.out.println("test.year: "+test.year);

        ThisTest test2 = new ThisTest(3,67);
        System.out.println("test2.age: "+ test2.age);
        System.out.println("test2.year: " + test2.year);

    }
};

class ThisTest{
    int age = 10;
    int year = 15;

    ThisTest(){};

    ThisTest(int age, int year){
        this.age = age;
        this.year = year;
    }

}


