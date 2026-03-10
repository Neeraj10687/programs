class bubble{
  public static void sort(int nums[]){

    for(int i=0;i<=nums.length-2;i++){
      int swaps=0;
      for(int j=0;j<=nums.length-2-i;j++){
        if(nums[j]>nums[j+1]){
          int temp=nums[j];
          nums[j]=nums[j+1];
          nums[j+1]=temp;
          swaps++;
        }
      }
      if(swaps==0){
        System.out.println("already sorted");
        break;
      }
    }

  }
  public static void S_sort(int nums[]){

    for(int i=0;i<nums.length-1;i++){

        int min=i;
      for(int j=i+1;j<nums.length;j++){

        if(nums[j]<nums[min]){
          min=j;
        }


      }

      int temp =nums[min];
      nums[min]=nums[i];
      nums[i]=temp;
    }
  }
  public static void print(int nums[]) {
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    
  }
  public static void main(String args[]){
    int[] nums={5,1,3,4,2};
    S_sort(nums);
    print(nums);
  }
}
