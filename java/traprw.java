class traprw{
  
  public static int rw(int height[]) {
    int n =height.length;

    int[] leftarr = new int[n];
    leftarr[0]=height[0];
    for(int i = 1; i<n;i++){
      leftarr[i]=Math.max(height[i],leftarr[i-1]);
    }

    int[] rightarr = new int[n];
    rightarr[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
      rightarr[i]=Math.max(height[i],rightarr[i+1]);
    }

    int trw=0;

    for(int i=0;i<n;i++){

      int waterlevel=Math.min(leftarr[i],rightarr[i]);
      trw+= waterlevel-height[i];
    }


    return trw;
    
  }

  public static void main(String args[]){
    int[] height={4,2,0,6,3,2,5};

    System.out.println(rw(height) );
  }
}
