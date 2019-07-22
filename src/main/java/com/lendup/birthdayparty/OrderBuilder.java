package com.lendup.birthdayparty;

import java.util.Optional;

import com.lendup.birthdayparty.model.Balloons;
import com.lendup.birthdayparty.model.Cake;

/**
 * Birthday Party Order Builder which allows you to place an order for
 * either; cake or balloons or both.
 *
 */
public class OrderBuilder {
		
	private Optional<Balloons> balloons = Optional.empty();
	private Optional<Cake> cake = Optional.empty();

	/**
	 * Initialize both balloons and cake values
	 * 
	 * @param balloons
	 * @param cake
	 */
	public OrderBuilder(Balloons balloons, Cake cake) {
		this.balloons = Optional.of(balloons);
		this.cake = Optional.of(cake);
	}
	
	/**
	 * Initialize balloons values
	 * 
	 * @param balloons
	 */
	public OrderBuilder(Balloons balloons) {
		this.balloons = Optional.of(balloons);
	}
	
	/**
	 * Initialize cake values
	 * @param cake
	 */
	public OrderBuilder(Cake cake) {
		this.cake = Optional.of(cake);
	}

	/**
	 * If balloons details are present place an order for balloons
	 * Similarly, if cake details are present, place an order for cake
	 */
	public void placeOrder() {
		// implementation of placing birthday party order
		if (balloons.isPresent()) {
			orderBalloons();
		}
		if (cake.isPresent()) {
			orderCake();
		}
	}
	
	private void orderBalloons() {
		if (!balloons.isPresent()) {
			throw new RuntimeException("cannot place balloons order, please provide balloons details"); 
		}
		// implementation of placing balloons order
		System.out.println(balloons.get() + " order placed...");
	}
	
	private void orderCake() {
		if (!cake.isPresent()) {
			throw new RuntimeException("cannot place cake order, please provide cake details"); 
		}
		// implementation of placing cake order
		System.out.println(cake.get() + " order placed...");
	}
}
