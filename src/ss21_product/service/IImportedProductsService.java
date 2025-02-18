package ss21_product.service;

import ss21_product.model.ImportedProducts;

import java.util.List;

public interface IImportedProductsService {
    List<ImportedProducts> getImportedProducts();

    void addImportedProducts(ImportedProducts importedProducts);

    boolean editImportedProducts(int id, ImportedProducts importedProducts);

    boolean deleteImportedProducts(int id);

    List<ImportedProducts> searchImportedProducts(int id);
}
