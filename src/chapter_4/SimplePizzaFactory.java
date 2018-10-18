package chapter_4;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        }

        return pizza;
    }

}
