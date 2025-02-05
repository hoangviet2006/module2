package ss16.bai_tap.bai_1.service;

import ss16.bai_tap.bai_1.model.Bird;

import java.util.List;

public interface IBird {
    List<Bird> getBird();

    void addBird(Bird bird);

    boolean deleteBird(String name);

    boolean editBird(String name, Bird bird);

    List<Bird> SearchBird(String name);
}
