package OppsConcepts;

public class LetsTryOverloading {

    public  int add(int a,int b){
        return a+b;

    }
    public  double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
LetsTryOverloading lt = new LetsTryOverloading();
        System.out.println(lt.add(3,3));
lt.add(23.3,23.3);

    }
}
