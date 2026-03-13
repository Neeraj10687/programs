import java.util.*;
class hashmaps{
  public static void main(String args[]){
    HashMap<String, Integer> hm=new HashMap<>();

    //insert
    hm.put("india",80);
    hm.put("pp",23);
    hm.put("cambodia",50);
    hm.put("canada",19);
    hm.put("europe",30);
    hm.put("US",97);

    System.out.println(hm);

    Set<String>keys=hm.keySet();

    System.out.println(keys);

    for (String k : keys) {

      System.out.println("k"+k+"value gotten"+hm.get(k));
      
    }




  }
}
