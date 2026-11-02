import java.util.ArrayList;
import java.util.List;

public class BinaryList {
    private ArrayList<Integer> binaryList;

    public BinaryList(List<Integer> inputList) {
        for (Integer num : inputList) {
            if (num != null && num != 0 && num != 1) {
                throw new IllegalArgumentException("List can only contain 1 and 0. Found: " + num);
            }
        }
        // If valid, wrap it into a new ArrayList
        this.binaryList = new ArrayList<>(inputList);
    }

    public BinaryList(ArrayList<Integer> inputList) {
        for (Integer num : inputList) {
            if (num != null && num != 0 && num != 1) {
                throw new IllegalArgumentException("List can only contain 1 and 0. Found: " + num);
            }
        }
        // If valid, wrap it into a new ArrayList
        this.binaryList = new ArrayList<>(inputList);
    }

    public ArrayList<Integer> getBinaryList() {
        return binaryList;
    }
}
