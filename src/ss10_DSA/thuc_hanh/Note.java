package ss10_DSA.thuc_hanh;

public class Note {
    private Note next;
    private Object data;

    public Note(Object data ) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
