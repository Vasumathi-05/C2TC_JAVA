package c2tc.framework;

public interface Shopfactory {
public PrimeAcc getNewPrimeAccount(int accno,String accname,float charges);
public NormalAcc getNewNormalAccount(int accno,String accname,float charges);
}
