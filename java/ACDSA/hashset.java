import java.util.*;
class hashset{
  public static void main(String args[]){
    HashSet<String> hs=new HashSet<>();
    hs.add("pei");
    hs.add("dog");
    hs.add("hello");

    System.out.println(hs);
     LinkedHashSet<String> lhs=new LinkedHashSet<>();
    lhs.add("pei");
    lhs.add("dog");
    lhs.add("hello");

    System.out.println(lhs);


  }
}
