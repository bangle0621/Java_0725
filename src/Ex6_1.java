public class Ex6_1 {

    public static void main(String[] args){
        Tv t;
        t = new Tv(){};
        t.channel = 7;
        t.channelDown();
        System.out.println("채널은 "+t.channel+"입니다.");
        


    }

}
class Tv{
    int channel;

    void channelDown(){channel--;}
}
