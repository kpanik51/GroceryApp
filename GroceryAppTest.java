public class GroceryAppTest {
  public static void main(String[] args) {
    testGroceryItem();
    testCategory();
    testGroceryListManager();
  }

  private static void testGroceryItem() {
    GroceryItem item1 = new GroceryItem("Apple", 5, "pieces", 1.99);
    GroceryItem item2 = new GroceryItem("Milk", 1, "gallon", 2.49);

    System.out.println(item1);
    System.out.println(item2);
  }

  private static void testCategory() {
    Category category1 = new Category("Fruits", "Healthy fruits");
    Category category2 = new Category("Dairy", "Dairy products");

    System.out.println(category1);
    System.out.println(category2);
  }

  private static void testGroceryListManager() {
    GroceryListManager manager = new GroceryListManager();

    GroceryItem item1 = new GroceryItem("Banana", 3, "pieces", 0.99);
    GroceryItem item2 = new GroceryItem("Bread", 1, "loaf", 2.49);

    Category category1 = new Category("Fruits", "Healthy fruits");
    Category category2 = new Category("Bakery", "Fresh bakery items");

    manager.addItem(item1);
    manager.addItem(item2);
    manager.addCategory(category1);
    manager.addCategory(category2);

    System.out.println("Grocery Items:");
    manager.getGroceryItems().forEach(System.out::println);

    System.out.println("\nCategories:");
    manager.getCategories().forEach(System.out::println);
  }
}
