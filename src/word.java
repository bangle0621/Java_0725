import java.util.ArrayList;
import java.util.List;

public class word {

    public static void main(String args[]){

        //단어 추가
        word newword = new word();

        newword.wordzip("안녕");
        newword.wordzip("반가워");
    }


    //단어장
    public void wordzip(String word){
        List wordlist = new ArrayList<>();

        wordlist.add(word);

        System.out.println(wordlist);
    }

}
