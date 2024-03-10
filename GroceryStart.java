import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GroceryListApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grocery List App");

        // Main Window
        Button openCatalogButton = new Button("Open Catalog");
        openCatalogButton.setOnAction(event -> openProductCatalogWindow(primaryStage));

        StackPane mainLayout = new StackPane();
        mainLayout.getChildren().add(openCatalogButton);

        Scene mainScene = new Scene(mainLayout, 300, 200);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private void openProductCatalogWindow(Stage primaryStage) {
        // Product Catalog Window
        Button addToCartButton = new Button("Add to Cart");
        addToCartButton.setOnAction(event -> {
            // Code to retrieve selected item from catalog and add it to the current list
            // Update list display
            System.out.println("Item added to cart!");
        });

        StackPane catalogLayout = new StackPane();
        catalogLayout.getChildren().add(addToCartButton);

        Scene catalogScene = new Scene(catalogLayout, 400, 300);

        // Create a new stage for the Product Catalog Window
        Stage catalogStage = new Stage();
        catalogStage.setTitle("Product Catalog");
        catalogStage.setScene(catalogScene);
        catalogStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
