public class DishTest extends DishTools {
    public static void main(String[] args) {
//        Dish dish1 = new Dish(1099, "Burger", true);
        //or

        Dish dish2 = new Dish();
        dish2.costInCents = 2000;
        dish2.nameOfDish = "Steak";
        dish2.wouldRecommend = false;

        dish2.printSummary();

        shoutDishName(dish2);
        analyzeDishCost(dish2);
        flipRecommendation(dish2);

    }
}
