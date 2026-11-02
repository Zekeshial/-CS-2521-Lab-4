import java.util.ArrayList;

public class HammingCode {
    private ArrayList<Integer> code;

    public HammingCode(ArrayList<Integer> code) {
        this.code = code;
    }


    public ArrayList<Integer> Encode11Bit() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(code.getFirst());
        list.add(0);
        list.add(code.get(1));
        list.add(code.get(2));
        list.add(code.get(3));
        list.add(0);
        for (int i = 4; i <= 10; i++) {
            list.add(code.get(i));
        }

        if (getParity1Sum(list)%2 != 0) {
            list.add(1, 1);
        }

        if (getParity2Sum(list)%2 != 0) {
            list.add(2, 1);
        }

        if (getParity4Sum(list)%2 != 0) {
            list.add(4, 1);
        }

        if (getParity8Sum(list)%2 != 0) {
            list.add(8, 1);
        }

        return list;
    }

    public int getTotalSum(ArrayList<Integer> list){
        int sum = 0;
        for (Integer i: list) {
            sum += i;
        }
        return sum;
    }

    public int getParity1Sum(ArrayList<Integer> list) {
        int sum = 0;
        int index = 0;
        for (Integer i: list) {
            if (index%2 != 0) {
                sum += i;
            }
            index++;
        }
        return sum;
    }

    public int getParity2Sum(ArrayList<Integer> list) {
        int sum = 0;
        int index = 1;
        for (int i = index; i <= list.size(); i+=3) {
            sum += list.get(i);
            i++;
            sum += list.get(i);
        }
        return sum;
    }

    public int getParity4Sum(ArrayList<Integer> list) {
        int sum = 0;
        int index = 3;
        for (int i = index; i <= list.size(); i+=4) {
            for (int j = 0; j <= 3; j++) {
                sum += list.get(i);
                i++;
            }

        }
        return sum;
    }

    public int getParity8Sum(ArrayList<Integer> list) {
        int sum = 0;
        int index = 7;
        for (int i = index; i <= list.size(); i+=8) {
            for (int j = 0; j <= 7; j++) {
                sum += list.get(i);
                i++;
            }

        }
        return sum;
    }
}
