
public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodgeChance;


    Fighter(String name, int damage,int health, int weight, int dodgeChance){

        this.name= name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if(dodgeChance >= 0 && dodgeChance<= 100){
            this.dodgeChance = dodgeChance;
        }else{
            this.dodgeChance = 0;
        }
        this.dodgeChance = dodgeChance;
    }
    int hit(Fighter foe){

        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı muntazam bir şekilde blokladı.");
            System.out.println("---------------");
            return foe.health;
        }
        else{
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        }

        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodgeChance;
    }
}
