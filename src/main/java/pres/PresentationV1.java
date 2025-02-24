package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
/*
* injection des dependances par instanciation statique
* */
        DaoImpl d = new DaoImpl();
        MetierImpl m = new MetierImpl();
        m.setDao(d);
        System.out.println("Res ="+ m.calcul());
    }
}
