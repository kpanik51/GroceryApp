import java.util.ArrayList;
import java.util.List;

public class GroceryListManager {
  private List<GroceryItem> groceryItems;
  private List<Category> categories;

  public GroceryListManager() {
    this.groceryItems = new ArrayList<>();
    this.categories = new ArrayList<>();
  }

  public void addItem(GroceryItem item) {
    groceryItems.add(item);
  }

  public void addCategory(Category category) {
    categories.add(category);
  }

  public void categorizeItem(int itemID, int categoryID) {
  
  }

  public void markAsPurchased(int itemID) {
   c
  }

  public void clearList() {
    groceryItems.clear();
  }

  public List<GroceryItem> getGroceryItems() {
    return new ArrayList<>(groceryItems);
  }

  public List<Category> getCategories() {
    return new ArrayList<>(categories);
  }
}
