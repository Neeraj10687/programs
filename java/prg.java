class prg{
public static void main(String args[]){

  System.out.println("hi");
  int N=5;
  char ch ='A';
  int n=5;
  int c=4;
  int count=1;

  for (int i = 1; i <= n; i++) {


    for (int j = 1; j <=(n-i); j++) {

      System.out.print(" ");
      
    }
    for(int j=1;j<=2*i-1;j++){
      System.out.print("*");
    }


    System.out.println();
    }

    
  
for (int i = n; i >=1; i--){

    for (int j = 1; j <= (n-i); j++) {

      System.out.print(" ");
      
    }
    for(int j=1;j<=2*i-1;j++){
      System.out.print("*");
    }


    System.out.println();
    }

 
 
     
}

}

