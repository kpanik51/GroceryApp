public class GroceryItem {
  private static int nextItemID = 1;

  private int itemID;
  private String itemName;
  private int quantity;
  private String unit;
  private double price;
  private boolean isPurchased;
  private String notes;
  private String storePurchased;
  private String receiptImageURL;
  private int categoryID;

  public GroceryItem(String itemName, int quantity, String unit, double price) {
    this.itemID = nextItemID++;
    this.itemName = itemName;
    this.quantity = quantity;
    this.unit = unit;
    this.price = price;
    this.isPurchased = false;
  }

  //Not Complete

  @Override
  public String toString() {
    return "GroceryItem{" +
        "itemID=" + itemID +
        ", itemName='" + itemName + '\'' +
        ", quantity=" + quantity +
        ", unit='" + unit + '\'' +
        ", price=" + price +
        ", isPurchased=" + isPurchased +
        ", notes='" + notes + '\'' +
        ", storePurchased='" + storePurchased + '\'' +
        ", receiptImageURL='" + receiptImageURL + '\'' +
        ", categoryID=" + categoryID +
        '}';
  }
}
