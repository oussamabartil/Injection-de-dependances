package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    //couplage faible
    private IDao dao;

    @Override
    public double calcul() {
        return 0;
    }

    /* Pour injecter dans la variable sao un oblet
    * d'une classe qui implémente l'interface IDao*/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
