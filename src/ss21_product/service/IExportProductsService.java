package ss21_product.service;

import ss21_product.model.ExportProducts;


import java.util.List;

public interface IExportProductsService {
    List<ExportProducts> getExportProducts();

    void addExportProducts(ExportProducts exportProducts);

    boolean editExportProducts(int id, ExportProducts exportProducts);

    boolean deleteExportProducts(int id);

    List<ExportProducts> searchExportProducts(int id);
}
