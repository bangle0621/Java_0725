import org.w3c.dom.ls.LSOutput;

class Call {


    public static void main(String argsp[]) {

        Elevator e = new Elevator();
        e.print(501);
        e.print(793);
        e.print(420);

    }
}


class Elevator{

    void print(int a){

        Elevator e = new Elevator();
        int floor = e.elevator(a);

        if(floor!=0) {
            System.out.println("엘레베이터는 " + floor + "층으로 가면 된다.");
        }else{
            System.out.println("우리 아파트에는 없는 집이예요");
        }
    }

    int elevator(int a){
        int floor;

        if(100<a&&a<200){return floor = 1;}
        else if(200<a&&a<300){return floor =2;}
        else if(300<a&&a<400){return floor =3;}
        else if(400<a&&a<500){return floor =4;}
        else if(500<a&&a<600){return floor =5;}
        else if(600<a&&a<700){return floor =6;}
        else{return 0;}
    }
}
