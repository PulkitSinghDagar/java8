package OppsConcepts;
class Animal{
    public void animal(){
        System.out.println("this is animal");
    }
}
class  dog extends Animal{
    @Override
    public void animal() {
        System.out.println("this is dog");
    }
}
public class overrriingConcepts {
    public static void main(String[] args) {
dog d = new dog();
d.animal();


Animal a = new Animal();
a.animal();
    }
}
