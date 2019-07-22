package com.lendup.birthdayparty;

import com.lendup.birthdayparty.model.Balloons;
import com.lendup.birthdayparty.model.Cake;
import com.lendup.birthdayparty.model.Color;
import com.lendup.birthdayparty.model.Flavor;
import com.lendup.birthdayparty.model.Shape;
import com.lendup.birthdayparty.model.Size;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }
	
    public static void main(String[] args) {

        //Place birthday party orders
    	
    	// order red balloons and large chocolate cake
    	Balloons redBalloons = new Balloons(Color.Red, "mylar", 4);
    	Cake largeChocolate = new Cake(Flavor.Chocolate, Flavor.Chocolate, Shape.Circle, Size.Large, Color.Brown);
    	new OrderBuilder(redBalloons, largeChocolate).placeOrder();
    	
    	// order blue balloons and medium vanilla cake
    	Balloons blueBalloons = new Balloons(Color.Blue, "latex", 7);
    	Cake mediumVanilla = new Cake(Flavor.Vanilla, Flavor.Chocolate, Shape.Square, Size.Medium, Color.Brown);
    	new OrderBuilder(blueBalloons, mediumVanilla).placeOrder();

    	// order yellow balloons and small vanilla cake
    	Balloons yellowBalloons = new Balloons(Color.Yellow, "mylar", 4);
    	Cake smallVanilla = new Cake(Flavor.Vanilla, Flavor.Vanilla, Shape.Square, Size.Small, Color.Yellow);
    	new OrderBuilder(yellowBalloons, smallVanilla).placeOrder();

    	// Just order medium chocolate cake
    	Cake mediumChocolate = new Cake(Flavor.Chocolate, Flavor.Chocolate, Shape.Circle, Size.Medium, Color.Brown);
    	new OrderBuilder(mediumChocolate).placeOrder();
    	
    	// Just order red balloons
    	Balloons redBalloons1 = new Balloons(Color.Red, "latex", 10);
    	new OrderBuilder(redBalloons1).placeOrder();
   }
	
}
