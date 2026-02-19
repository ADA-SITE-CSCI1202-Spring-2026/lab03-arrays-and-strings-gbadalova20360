import java.util.Arrays;

public class StringUtils {

    public static String reverse(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            sb.append(c);

        }
        return sb.toString();

    }

    public static String exploded(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()+1;i++){
            sb.append(s.substring(0,i));

        }
        return sb.toString();


    }

    public static String sorting(String s){
        char [] sortedArray=s.toCharArray();
        Arrays.sort(sortedArray);
        return new String(sortedArray);


    }

    public static boolean anagrams(String s1,String s2){
        String n_s1=sorting(s1);
        String n_s2=sorting(s2);
        return n_s1.equals(n_s2);
    }

    public static String swap(String s){
        StringBuilder result=new StringBuilder();
        String[] words=s.split(" ");
        for(String word: words){
            if(word.length()>1){
                char first=word.charAt(0);
                char last=word.charAt(word.length()-1);
                String m=word.substring(1,word.length()-1);
                String new_Word=last+m+first;
                result.append(new_Word).append(" ");


            }
        }
        return result.toString().trim();
    }




    public static void main(String[] args){
        String s1="Hello";
        System.out.println(StringUtils.reverse(s1));
        String s2="Baku";
        System.out.println(StringUtils.exploded(s2));
        System.out.println(StringUtils.sorting(s2));
        System.out.println(StringUtils.anagrams("listen","silent"));
        System.out.println(StringUtils.swap("This is PP2 Fall 2021"));





    }
}
