package MeanOfTransportation.view;

import MeanOfTransportation.model.MeanOfTransportation;

import java.util.AbstractList;
import java.util.Scanner;

public class MeanOfTransportationView {
    private static Scanner scanner = new Scanner(System.in);

    public static MeanOfTransportation inPut(){
        System.out.println("-----Nhập tên--------");
        String name = scanner.nextLine();
        System.out.println("----Nhập ID-----");
        int id = Integer.parseInt(scanner.nextLine());
        MeanOfTransportation meanOfTransportation = new MeanOfTransportation(id,name);
        return meanOfTransportation;
    }
    public static String inputName(){
        System.out.println("-----Nhập tên------");
        String name = scanner.nextLine();
        return name;
    }
    public static void Search(AbstractList<MeanOfTransportation> arrayList){
        if (arrayList.size()>0){
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }else {
            System.out.println("------không tìm thấy tên--");
        }

    }

}
