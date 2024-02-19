public class Category {
  private static int nextCategoryID = 1;

  private int categoryID;
  private String categoryName;
  private String description;

  public Category(String categoryName, String description) {
    this.categoryID = nextCategoryID++;
    this.categoryName = categoryName;
    this.description = description;
  }

  // Not Complete

  @Override
  public String toString() {
    return "Category{" +
        "categoryID=" + categoryID +
        ", categoryName='" + categoryName + '\'' +
        ", description='" + description + '\'' +
        '}';
  }
}
