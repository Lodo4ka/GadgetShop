package controller;

import entity.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import service.ProductService;
import java.util.List;

/**
 * Created by lodo4ka on 23/06/2017.
 */
public class AdminPanelController {

    @FXML
    TextField idField;

    @FXML
    TextField nameField;

    @FXML
    TextField descField;

    @FXML
    TextField typeField;

    @FXML
    TextField priceField;




    @FXML
    private TableView<Product> productTable;


    ProductService productService = new ProductService();

    public void initialize() {
        TableColumn nameColumn = createColumn("Name", "name");
        TableColumn descColumn = createColumn("Description", "description");
        TableColumn typeColumn = createColumn("Type", "type");
        TableColumn priceColumn = createColumn("Price", "price");

        ObservableList columns = productTable.getColumns();
        columns.addAll(nameColumn, descColumn, typeColumn, priceColumn);


        List<Product> allProducts = productService.getAll();

        ObservableList<Product> productList = FXCollections.observableArrayList(allProducts);
        productTable.setItems(productList);
    }

    public TableColumn createColumn(final String nameColumn, String entityFieldName) {
        TableColumn column = new TableColumn(nameColumn);
        column.setMinWidth(100);
        column.setCellValueFactory(new PropertyValueFactory<>(entityFieldName));
        return column;
    }


    public void remove() {
        Product selectedItem = productTable.getSelectionModel().getSelectedItem();
        ObservableList<Product> items = productTable.getItems();
        items.remove(selectedItem);
        productService.remove(selectedItem);
    }

    public void add() {
        ObservableList<Product> items = productTable.getItems();
        Product product = new Product(Integer.parseInt(idField.getText()),nameField.getText(), descField.getText(),
                typeField.getText(), Integer.parseInt(priceField.getText()));
        items.add(product);
        productService.add(product);
        nameField.clear();
        descField.clear();
        typeField.clear();
        priceField.clear();
    }
}
