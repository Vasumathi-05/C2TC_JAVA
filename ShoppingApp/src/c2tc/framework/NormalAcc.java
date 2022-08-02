package c2tc.framework;

public class NormalAcc extends ShopAcc {
	protected float deliverycharges=50;
public NormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
	}

public float getDeleverycharges() {
	return deliverycharges;
}

public void setDeleverycharges(float deleverycharges) {
	this.deliverycharges = deleverycharges;
}

}
