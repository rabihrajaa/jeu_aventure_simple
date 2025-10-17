package rabih.patternstrategy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternStrategyApplication {

    public static void main(String[] args) {

        SpringApplication.run(PatternStrategyApplication.class, args);

        ComportementHache comportementHache = new ComportementHache();
        Personnage p1=new Roi(comportementHache);
        p1.Combattre();

        ComportementArcEtFleches comportementArcEtFleches=new ComportementArcEtFleches();
        Personnage p2=new Chevalier(comportementArcEtFleches);
        p2.Combattre();

        ComportementPoignard comportementPoignard=new ComportementPoignard();
        Personnage p3=new Troll(comportementPoignard);
        p3.Combattre();
    }

}
