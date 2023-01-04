package com.test.java;

public class PlayerTest {
    public static void main(String[] args){

        Player p = new AudioPlayer();

        p.color("검정");
        p.volume(5);

    }
}
abstract class Player{
    abstract void volume(int v);
    abstract void color(String co);

}
class AudioPlayer extends Player{
    @Override
    void volume(int v) {
        System.out.println("볼륨은 " + v + "입니다.");
    }

    @Override
    void color(String co) {
        System.out.println("색상은 " + co + "입니다.");
    }
}