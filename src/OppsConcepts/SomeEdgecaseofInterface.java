package OppsConcepts;
interface mammal{
    void eat();
}
interface Animall{
    void eat();
}
interface dogg extends mammal ,Animall{

}
public class SomeEdgecaseofInterface implements dogg {
    public static void main(String[] args) {
        SomeEdgecaseofInterface nee= new SomeEdgecaseofInterface();
        nee.eat();


    }

    @Override
    public void eat() {
        System.out.println("eating");
    }

//    @Override
//    public void sleep() {
//        System.out.println("sleeping");
//    }


}
