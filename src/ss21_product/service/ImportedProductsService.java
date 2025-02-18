package ss21_product.service;

import ss21_product.model.ImportedProducts;
import ss21_product.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ImportedProductsService implements IImportedProductsService {

    private static final String IMPORTEDPRODUCTS_FILE = "D:\\codegym\\module2\\src\\ss21_product\\data\\product.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public List<ImportedProducts> getImportedProducts() {
        List<ImportedProducts> list = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(IMPORTEDPRODUCTS_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array[array.length - 1].contains("NK")) {
                ImportedProducts importedProducts = new ImportedProducts(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]), Integer.parseInt(array[4]));
                list.add(importedProducts);
            }
        }
        return list;
    }

    @Override
    public void addImportedProducts(ImportedProducts importedProducts) {
        List<ImportedProducts> list = getImportedProducts();
        if (list.size()==0){
            importedProducts.setId(1);
        }else {
           importedProducts.setId(list.get(list.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(importedProducts.getInfoToFile());
        ReadAndWriteFile.writeFile(IMPORTEDPRODUCTS_FILE, stringList, APPEND);
    }

    @Override
    public boolean editImportedProducts(int id, ImportedProducts importedProducts) {
        List<ImportedProducts> importedProductsList = getImportedProducts();
        importedProducts.setId(id);
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (importedProductsList.get(i).getId() == id) {
                importedProductsList.set(i, importedProducts);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (ImportedProducts importedProducts1 : importedProductsList) {
            stringList.add(importedProducts1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(IMPORTEDPRODUCTS_FILE, stringList, NOT_APPEND);
        return true;
    }

    @Override
    public boolean deleteImportedProducts(int id) {
        List<ImportedProducts> importedProductsList = getImportedProducts();
        boolean check = false;
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (importedProductsList.get(i).getId() == id) {
                check = true;
                importedProductsList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (ImportedProducts importedProducts : importedProductsList) {
                stringList.add(importedProducts.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(IMPORTEDPRODUCTS_FILE, stringList, NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<ImportedProducts> searchImportedProducts(int id) {
        List<ImportedProducts> importedProductsList = getImportedProducts();
        List<ImportedProducts> productsList = new ArrayList<>();
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (importedProductsList.get(i).getId() == id) {
                productsList.add(importedProductsList.get(i));
                break;
            }
        }
        return productsList;
    }
}
