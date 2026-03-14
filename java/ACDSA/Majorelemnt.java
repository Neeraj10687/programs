import java.util.*;
class Majorelemnt{

  

  public  static void main(String args[]){
    int num[]={1,3,1,1,1,3,5,5};

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<num.length;i++){
      int key =num[i];

      map.put(key,map.getOrDefault(key,0)+1);

          }

    System.out.println(map);

    for(Integer Key:map.keySet()){
      if(map.get(Key)>num.length/3){
        System.out.println(Key);
      }
    }


  }

}
