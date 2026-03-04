class pp{

  public static int rever(int num[]){
    int sum=0;
    int max=Integer.MIN_VALUE;
    int[] pre = new int[num.length];

    pre[0]=num[0];

    for(int i=1;i<pre.length;i++){
      pre[i]=pre[i-1]+num[i];
    }

    for(int i=0;i<num.length;i++){
      for(int j=i;j<num.length;j++){

         sum= i==0?pre[j]:pre[j]-pre[i-1];



        }
        System.out.println("sum is "+sum);
        if (max<sum) {
          max=sum;
          
        }
        System.out.println();
    System.out.println(max);
      }
    return 0;
    }
  


  public static void main(String args[]) {

    int num[]={2,4,6,8,10};


    int key=7;

    rever(num);

    for (int i = 0; i < num.length; i++) {

      System.out.print(num[i]+" ");
      
    }


    

    

  
  }
}
