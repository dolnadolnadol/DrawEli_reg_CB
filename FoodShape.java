public class FoodShape{
    private Food food;
    public String drawAsElipse(){
        food = new Elipse();
        return food.draw();
    }
    public String drawAsRestangle(){
        food = new rectangle();
        return food.draw();
    }
}