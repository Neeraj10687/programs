import java.util.*;
class valAnag{
  public static void main(String args[]){
    String s ="knee";
    String t ="een";

    if(s.length()!=t.length()){
      System.out.println("false");
    }

    HashMap<Character,Integer> Cs=new HashMap<>();
    HashMap<Character,Integer> Ts=new HashMap<>();

    for(int i=0;i<s.length();i++){

      Cs.put(s.charAt(i),Cs.getOrDefault(s.charAt(i),0)+1);
      Ts.put(t.charAt(i),Ts.getOrDefault(t.charAt(i),0)+1);


    }

    System.out.println(Cs.equals(Ts));
  }
}
