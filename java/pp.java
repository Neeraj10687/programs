class pp{

  public static int rever(int num[]){
    for(int i=0;i<num.length;i++){
      for(int j=i;j<num.length;j++){
        for(int k=i;k<=j;k++){

          System.out.print("numbers "+ num[k]);

        }
        System.out.println();
      }
      System.out.println();
    }
    return 0;
  }


  public static void main(String args[]) {

    int num[]={1,2,3,4,6,7,9};


    int key=7;

    rever(num);

    for (int i = 0; i < num.length; i++) {

      System.out.print(num[i]+" ");
      
    }


    

    

  
  }
}
