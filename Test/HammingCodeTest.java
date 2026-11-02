import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HammingCodeTest {

    @Test
    void Encode11Bit() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);
        HammingCode code = new HammingCode(bList.getBinaryList());
        ArrayList<Integer> actual = code.Encode11Bit();
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(0);
        expected.add(0);
        expected.add(1);
        expected.add(0);
        expected.add(0);
        expected.add(0);
        expected.add(1);
        expected.add(0);
        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        System.out.println(expected);
        //Expected is adding ones and zeros needs to be fixed.



        assertEquals(actual, expected);
    }

    @Test
    void test() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list.add(4,2);
        System.out.println(list);
    }

    @Test
    void getTotalSum() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());
        int actual = code.getTotalSum(bList.getBinaryList());
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    void getParity1Sum() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity1Sum(bList.getBinaryList());
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void getParity2Sum() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity2Sum(bList.getBinaryList());
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void getParity2SumTest2() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;
        int p16 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(p16);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity2Sum(bList.getBinaryList());
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void getParity4Sum() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity4Sum(bList.getBinaryList());
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void getParity8SumTest1() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(1);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity8Sum(bList.getBinaryList());
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void getParity8SumTest2() {
        int p1 = 0;
        int p2 = 0;
        int p4 = 0;
        int p8 = 0;

        List<Integer> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(1);
        list.add(p4);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(p8);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        BinaryList bList = new BinaryList(list);

        HammingCode code = new HammingCode(bList.getBinaryList());

        int actual = code.getParity8Sum(bList.getBinaryList());
        int expected = 5;

        assertEquals(expected, actual);
    }

}