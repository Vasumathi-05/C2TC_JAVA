package c2tc.b18.vasu;

import c2tc.application.GSNormalAcc;
import c2tc.application.GSPrimeAcc;
import c2tc.application.GSShopfactory;
import c2tc.framework.NormalAcc;
import c2tc.framework.PrimeAcc;
import c2tc.framework.Shopfactory;

public class Client {

	public static void main(String[] args) {
		
     Shopfactory sf=new GSShopfactory();
     PrimeAcc pa=new GSPrimeAcc(234,"Vasumathi", 100);
     pa.bookProducts(500);
     NormalAcc na=new GSNormalAcc(123,"Jessi",0f);
     na.bookProducts(500);
	}

}
