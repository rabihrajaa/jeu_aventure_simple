                   <<interface>>
                ComportementArme
                     ▲
     ┌────────────────┼────────────────┐
     │                │                │
ComportementEpee  ComportementArc  ComportementHache  ComportementCouteau
     (concret)         (concret)         (concret)         (concret)


           Personnage (abstraite)
                   │
        ┌──────────┼──────────┐
        │          │          │
       Roi       Reine     Chevalier     Troll
     (concret)  (concret)  (concret)   (concret)

Personnage --- a une ---> ComportementArme
          (composition : chaque personnage a une arme)
