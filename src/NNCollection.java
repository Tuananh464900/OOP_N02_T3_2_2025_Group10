public class NNCollection {
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;

    public NNCollection() {
        free = 0;
    }

    public void insert(NameNumber n) {
        if (free >= nnArray.length) {
            System.out.println("Array is full, cannot insert.");
            return;
        }

        int i;
        free++;

        for (i = free - 1; i > 0 && nnArray[i - 1].getLastName().compareTo(n.getLastName()) > 0; i--) {
            nnArray[i] = nnArray[i - 1];
        }

        nnArray[i] = n;
    }

    public void display() {
        for (int i = 0; i < free; i++) {
            System.out.println(nnArray[i].getLastName() + ": " + nnArray[i].getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        NNCollection collection = new NNCollection();

        collection.insert(new NameNumber("Nguyen", "123456789"));
        collection.insert(new NameNumber("Tran", "987654321"));
        collection.insert(new NameNumber("Le", "555555555"));
        collection.insert(new NameNumber("Pham", "111222333"));

        collection.display();
    }
}
