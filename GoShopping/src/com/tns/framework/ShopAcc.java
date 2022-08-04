package com.tns.framework;

public abstract class ShopAcc {
	//isPrime
	private boolean isPrime = true;

	public boolean getisPrime() {
		return this.isPrime;
	}

//	deliveryCharges
	private static final float deliveryCharges = 0;

	public float getDeliverycharges() {
		return deliveryCharges;
	}

//	Constructor
	public ShopAcc(int AccNo, String accNm, float charges) {
		
		this.isPrime = isPrime;

	}
	public ShopAcc(boolean isPrime) {
		super();
		this.isPrime = isPrime;
	}

	public void bookProduct(float f) { 
		System.out.println("Your order is Placed");
	}

	@Override
	public String toString() {
		return "You are a Prime Member your delivery charges on any product is " + deliveryCharges + "\n"
				+ super.toString();
	}
}