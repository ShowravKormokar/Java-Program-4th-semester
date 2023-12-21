public class Fan{
    public const  SLOW = 1; 
    public const  MEDIUM = 2; 
    public const  FAST = 3;


    public void runSlow(){
        System.out.println("Run slow= "+ SLOW);
    }
    public void runMedium(){
        System.out.println("Run medium= "+ MEDIUM);
    }
    public void runFast(){
        System.out.println("Run fast= "+ FAST);
    }
    public void fanStart(){
        System.out.println("Fan is start");
    }
    public void fanStop(){
        System.out.println("Fan is stop");
    }
}