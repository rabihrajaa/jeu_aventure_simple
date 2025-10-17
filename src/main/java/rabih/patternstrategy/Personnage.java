package rabih.patternstrategy;

public abstract class Personnage {
    ComportementArme arme;

    public Personnage(ComportementArme arme) {
        this.arme = arme;
    }

    public void Combattre(){
        arme.utiliserArme();
    }
}
