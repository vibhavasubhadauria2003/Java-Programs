// 5 Create an abstract class GameCharacter with methods attack() and defend().
// Implement subclasses Warrior, Mage, and Archer that provide specific
// implementations for these methods. Write a program to demonstrate the abilities of
// different characters.
abstract class GameCharacter{
    abstract void attack();
    abstract void defend();
}
class Warrior extends GameCharacter{
    void attack(){
        System.out.println("Attack with Swords");
    }
    void defend(){
        System.out.println("Defend with Sheild");
    }
}
class Maze extends GameCharacter{
    void attack(){
        System.out.println("Attacks by confusing enemy");
    }
    void defend(){
        System.out.println("Defend by confusing enemy");
    }
}
class Archer extends GameCharacter{
    void attack(){
        System.out.println("Attacks by bow & arrows");
    }
    void defend(){
        System.out.println("Defend by City walls");
    }
}
public class Q5 {
    public static void main(String args[]){
        Warrior w1=new Warrior();
        w1.attack();
        w1.defend();
        Maze m1=new Maze();
        m1.attack();
        m1.defend();
        Archer a1=new Archer();
        a1.attack();
        a1.defend();
    }
}
