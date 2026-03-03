abstract class Progression {
  protected long current;

  public Progression(){
    this(0);
  }
  public Progression(long start){current = start;} 

  public long nextValue() {

    long answer = current;
    advance();
    return answer;
  }

  protected abstract void advance() ;
    

  public void printProgression(int n) {
    System.out.println(nextValue());
    for (int j = 0; j < n; j++) {
      System.out.println(" "+nextValue());
    }
    System.out.println(" ");

    
  }
  
}
class AP extends Progression{

  protected long increment;

  public AP(){this(1,0);}

  public AP(long stepsize){this(stepsize,0);}

  public AP(long stepsize,long start){
    super(start);
    increment=stepsize;
  }

  public void advance() {
    current+=increment;
    
  }

}
public class TotalProg{

  public static void main(String[] args) {
    Progression prog;

    prog = new AP();
    prog.printProgression(5);

  
  }

}
