package main;

import model.Bola;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Bola bolaBasket = new Bola("Bola Basket",100);
		Bola bolaBasket2 = (Bola) bolaBasket.clone();
		
		System.out.println(bolaBasket.getNamaBola());
		System.out.println(bolaBasket2.getNamaBola());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
