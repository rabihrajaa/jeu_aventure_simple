package rabih.patternstrategy;

public class ComportementPoignard implements ComportementArme {

    @Override
    public void utiliserArme() {
        System.out.println("utiliser Arme: ComportementPoignard");
    }
}
