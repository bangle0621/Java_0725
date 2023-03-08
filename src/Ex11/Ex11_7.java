package Ex11;


import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {
    public static void main(String[] args) {
        //문자열 배열 생성
        String[] animal = {"cat", "Dog", "lion", "tiger"};
        //일반 배열
        Arrays.sort(animal);
        System.out.println(Arrays.toString(animal));
        //대소문자 무시 배열
        Arrays.sort(animal,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(animal));
        //컴패어 호출
        Arrays.sort(animal,new Descending());
        System.out.println(Arrays.toString(animal));
    }

}
//비교 클래스 생성
class Descending implements Comparator {
    public int compare(Object o1, Object o2){
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}
