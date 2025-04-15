//NOUN: Person, Place, Thing, Idea
public class Person{
    //Adjectives become properties - facts things we know measures
    String fullName;
    int age;

    static double taxRate = 0.08;

    public Person(String fullName, int age){
        //Adjectives become properties
        this.fullName = fullName;
        this.age = age;
    }

    // VERB - Action word become our methods
    public static double getTaxRate(){
        return taxRate; //uses "shared" static property.
    }

    // VERB - Action
    public void greet(){
        System.out.printf(
                "Hello my name is %s, and I am %d years old. My rate is %.2f\n",
                this.fullName,
                this.age,
                getTaxRate());
    }
}
