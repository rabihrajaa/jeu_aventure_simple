package rabih.patternstrategy;

public class ComportementHache implements ComportementArme {

    @Override
    public void utiliserArme() {
        System.out.println("utiliser Arme: ComportementHache");
    }
}
