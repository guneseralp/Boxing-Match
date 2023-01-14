public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight= minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println("=========NEW ROUND=========");
                if(isFirstAttackChance()){
                    if(isWin()){
                        this.f2.health = this.f1.hit(this.f2);
                        if(isWin()){
                            break;
                        }
                        this.f1.health = this.f2.hit(this.f1);
                        if(isWin()){
                            break;
                        }
                    }else{
                        this.f1.health = this.f2.hit(this.f1);
                        if(isWin()){
                            break;
                        }
                        this.f2.health = this.f1.hit(this.f2);
                        if(isWin()){
                            break;
                        }
                    }
                }
                // %50 İHTİMALİNİ KATMADAN ÖNCE YAZILAN KOD
                /*this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }*/
                remainingHealth();
            }
        }else{
            System.out.println("Sporcuların sikletleri birbirine uymuyor.");
        }
    }
    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight &&
                (this.f2.weight >= minWeight && this.f2.weight <=maxWeight));
    }
    boolean isWin(){
        if(this.f1.health == 0){
            remainingHealth();
            System.out.println("Kazanan " + f2.name + ". Tebrikler!!");
            return true;
        }else if( this.f2.health == 0){
            remainingHealth();
            System.out.println("Kazanan " + f1.name + ". Tebrikler!");
        }
        return false;
    }
    boolean isFirstAttackChance(){
        double firstAttackChance = Math.random() * 100;
        return firstAttackChance <= 50;
    }
    void remainingHealth(){
        System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
        System.out.println(this.f2.name + " Sağlık: " + this.f2.health);
    }

}
