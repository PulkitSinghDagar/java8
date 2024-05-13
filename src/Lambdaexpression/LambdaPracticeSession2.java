package Lambdaexpression;

@FunctionalInterface
interface ex{
    public void meth1();
}
class experiment implements ex{
    void meth2(){
        System.out.println("welcome world");
    }

    @Override
    public void meth1() {
        System.out.println("welcomeeeee");
    }
}

public class LambdaPracticeSession2 {

    public static void main(String[] args) {
        experiment obj = new experiment();
        obj.meth1();



      ex mylambda=()-> System.out.println("wlcome world");
      mylambda.meth1();

    }
}
