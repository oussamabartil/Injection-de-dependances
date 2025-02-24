package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    //couplage faible
    private IDao dao;

    @Override
    public double calcul() {
        return 0;
    }
}
