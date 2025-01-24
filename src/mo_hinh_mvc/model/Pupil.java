package mo_hinh_mvc.model;

public class Pupil extends Human implements Comparable<Pupil> {
    private int birthday;

    public Pupil() {
    }


    public Pupil(int id, String name, double toan, double ly, double hoa, int birthday) {
        super(id, name, toan, ly, hoa);
        this.birthday = birthday;
    }

    public Pupil(String name, double toan, double ly, double hoa, int birthday) {
        super(name, toan, ly, hoa);
        this.birthday = birthday;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pupil{" + super.toString() +
                "birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Pupil o) {
        return (int) (this.getToan() - o.getToan());
    }
}
