package ss21_product.service;

import ss21_product.model.ExportProducts;
import ss21_product.model.ImportedProducts;
import ss21_product.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ExportProductsService implements IExportProductsService {
    private static final String EXPORTEDPRODUCTS_FILE = "D:\\codegym\\module2\\src\\ss21_product\\data\\product.csv";
    private static final boolean APPEND = true;
    private static final boolean NOT_APPEND = false;

    @Override
    public List<ExportProducts> getExportProducts() {
        List<ExportProducts> list = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(EXPORTEDPRODUCTS_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array[array.length - 1].contains("XK")) {
                ExportProducts exportProducts = new ExportProducts(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), Integer.parseInt(array[3]), array[4]);
                list.add(exportProducts);
            }
        }
        return list;
    }

    @Override
    public void addExportProducts(ExportProducts exportProducts) {
        List<ExportProducts> list = getExportProducts();
        if (list.size()==0){
            exportProducts.setId(1);
        }else {
          exportProducts.setId(list.get(list.size()-1).getId()+1);
        }
        List<String> stringList = new ArrayList<>();
        stringList.add(exportProducts.getInfoToFile());
        ReadAndWriteFile.writeFile(EXPORTEDPRODUCTS_FILE, stringList, APPEND);
    }

    @Override
    public boolean editExportProducts(int id, ExportProducts exportProducts) {
        List<ExportProducts> exportProductsList = getExportProducts();
        exportProducts.setId(id);
        for (int i = 0; i < exportProductsList.size(); i++) {
            if (exportProductsList.get(i).getId() == id) {
                exportProductsList.set(i, exportProducts);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (ExportProducts exportProducts1 : exportProductsList) {
            stringList.add(exportProducts1.getInfoToFile());
        }
        ReadAndWriteFile.writeFile(EXPORTEDPRODUCTS_FILE, stringList, NOT_APPEND);
        return true;
    }

    @Override
    public boolean deleteExportProducts(int id) {
        List<ExportProducts> exportProductsList = getExportProducts();
        boolean check = false;
        for (int i = 0; i < exportProductsList.size(); i++) {
            if (exportProductsList.get(i).getId() == id) {
                check = true;
                exportProductsList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (ExportProducts exportProducts : exportProductsList) {
                stringList.add(exportProducts.getInfoToFile());
            }
            ReadAndWriteFile.writeFile(EXPORTEDPRODUCTS_FILE, stringList, NOT_APPEND);
        }
        return check;
    }

    @Override
    public List<ExportProducts> searchExportProducts(int id) {
        List<ExportProducts> exportProductsList = getExportProducts();
        List<ExportProducts> exportProducts = new ArrayList<>();
        for (int i = 0; i < exportProductsList.size(); i++) {
            if (exportProductsList.get(i).getId() == id) {
                exportProducts.add(exportProductsList.get(i));
                break;
            }
        }
        return exportProducts;
    }
}
