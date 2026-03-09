class stocks{

  public static int mp(int price[]){

    int BP=Integer.MAX_VALUE;
    int MP=0;

    for(int i =0;i<price.length;i++){
      if(BP<price[i]){
        int prof=price[i]-BP;
        MP=Math.max(MP,prof);
      }
      else{
        BP=price[i];
      }
    }

    return MP;

  }

  public static void main(String args[]) {

    int price[]={7,1,5,3,6,4};

    System.out.println(mp(price));
    
  }
}
