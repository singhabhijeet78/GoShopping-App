package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges = 50;

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

//	Constructor
	public NormalAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		super(AccNo, accNm, charges);
	}

	public void bookProduct(float f) {
		System.out.println("Your order is Placed");
	}

	public String toString() {
		return "You are a Normal Member your delivery charges on any product is " + deliveryCharges + "\n"
				+ super.toString();
	}

}