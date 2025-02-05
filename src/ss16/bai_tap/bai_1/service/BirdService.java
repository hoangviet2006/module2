package ss16.bai_tap.bai_1.service;

import ss16.bai_tap.bai_1.model.Bird;
import ss16.bai_tap.bai_1.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class BirdService implements IBird {
    private final String BIRD_FILE = "src\\ss16\\bai_tap\\bai_1\\data\\bird.csv";
    private final boolean APPEND = true;
    private final boolean NOT_APPEND = false;

    @Override
    public List<Bird> getBird() {
        List<Bird> birdList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(BIRD_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Bird bird1 = new Bird(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]));
            birdList.add(bird1);
        }
        return birdList;
    }

    @Override
    public void addBird(Bird bird) {
        List<String> stringList = new ArrayList<>();
        stringList.add(bird.getInforToFile());
        ReadAndWriteFile.writeFile(BIRD_FILE, stringList, APPEND);
    }

    @Override
    public boolean  deleteBird(String name) {
        List<Bird> birdList = getBird();
        boolean check = false;
        for (int i = 0; i < birdList.size(); i++) {
            if (name.equals(birdList.get(i).getName())) {
                check = true;
                birdList.remove(i);
                break;
            }
        }
        if (check) {
            List<String> stringList = new ArrayList<>();
            for (Bird bird : birdList) {
                stringList.add(bird.getInforToFile());
            }
            ReadAndWriteFile.writeFile(BIRD_FILE, stringList, NOT_APPEND);
        }
        return check;
    }

    @Override
    public boolean editBird(String name, Bird bird) {
        List<Bird> birdList = getBird();
        for (int i = 0; i < birdList.size(); i++) {
            if (name.equals(birdList.get(i).getName())){
                birdList.set(i,bird);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Bird bird1 : birdList) {
            stringList.add(bird1.getInforToFile());
        }
        ReadAndWriteFile.writeFile(BIRD_FILE,stringList, NOT_APPEND);
        return true;
    }

    @Override
    public List<Bird> SearchBird(String name) {
        List<Bird> birdList = getBird();
        List<Bird> birds = new ArrayList<>();
        for (int i = 0; i < birdList.size(); i++) {
            if (name.contains(birdList.get(i).getName())) {
                birds.add(birdList.get(i));
            }
        }
        return birds;
    }
}
