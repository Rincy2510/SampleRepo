package polymorphism;

public class Clothes_discountcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes_onseason obj=new Clothes_onseason();
		Clothes_offseason obj1=new Clothes_offseason();
		double purchaseamount=1000;
		double onseasondiscount=obj.discount(purchaseamount);
		System.out.println("onseason discount: Rs."+onseasondiscount);
		System.out.println("Final price during onseason: Rs."+(purchaseamount-onseasondiscount));
		double offseasondiscount=obj1.discount(purchaseamount);
		System.out.println("offseason discount: Rs."+offseasondiscount);
		System.out.println("Final price during onseason: Rs."+(purchaseamount-offseasondiscount));
	}

}
