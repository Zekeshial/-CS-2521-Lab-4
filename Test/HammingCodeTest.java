import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HammingCodeTest {

    @Test
    void encode11Bit() {
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
        ArrayList<Integer> actual = code.encode11Bit();
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




        assertEquals(expected, actual);
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
    void getParity1SumTest2() {
        int p1 = 1;
        int p2 = 1;
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
        int expected = 4;

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

    //Testing no change
    @Test
    void syndromeTestNoChange() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,0,0,0));

        assertEquals(expected, actual);

    }

    //Testing bit 3 or indexed bit 2 changed
    @Test
    void syndromeTestBit3() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(2);
        encoded15Bits.add(2, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,0,1,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit5() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(4);
        encoded15Bits.add(4, 1);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,1,0,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit6() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(5);
        encoded15Bits.add(5, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,1,1,0));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit7() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(6);
        encoded15Bits.add(6, 1);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(0,1,1,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit9() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(8);
        encoded15Bits.add(8, 1);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,0,0,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit10() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(9);
        encoded15Bits.add(9, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,0,1,0));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit11() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(10);
        encoded15Bits.add(10, 1);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,0,1,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit12() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(11);
        encoded15Bits.add(11, 1);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1, 1, 0, 0));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit13() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(12);
        encoded15Bits.add(12, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,1,0,1));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit14() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(13);
        encoded15Bits.add(13, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,1,1,0));

        assertEquals(expected, actual);

    }

    @Test
    void syndromeTestBit15() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(14);
        encoded15Bits.add(14, 0);

        ArrayList<Integer> actual = code.syndrome(encoded15Bits);
        ArrayList<Integer> expected = new ArrayList<>(List.of(1,1,1,1));

        assertEquals(expected, actual);

    }


    @Test
    void deCodeSyndrome() {
        ArrayList<Integer> syndrome = new ArrayList<>(List.of(1,1,0,1));
        HammingCode code = new HammingCode(null);
        int actual = code.deCodeSyndrome(syndrome);
        int expected = 13;
        assertEquals(expected, actual);
    }

    @Test
    void deCodeSyndromeTest2() {
        ArrayList<Integer> syndrome = new ArrayList<>(List.of(0,1,0,1));
        HammingCode code = new HammingCode(null);
        int actual = code.deCodeSyndrome(syndrome);
        int expected = 5;
        assertEquals(expected, actual);
    }


    //Testing if the code has an error
    @Test
    void deCode11Bit() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        encoded15Bits.remove(13);
        encoded15Bits.add(13, 0);
        ArrayList<Integer> actual = code.deCode11Bit(encoded15Bits);
        ArrayList<Integer> expected = bList.getBinaryList();

        assertEquals(expected,actual);

    }

    //Testing if the code doesn't have an error
    @Test
    void deCode11BitTest2() {
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        ArrayList<Integer> actual = code.deCode11Bit(encoded15Bits);
        ArrayList<Integer> expected = bList.getBinaryList();

        assertEquals(expected,actual);

    }

    //Testing if change can be fixed
    @Test
    void correct15BitHammingCodeTest(){
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        ArrayList<Integer> testList = encoded15Bits;
        testList.remove(13);
        testList.add(13, 0);
        ArrayList<Integer> actual = code.correct15BitHammingCode(testList);
        ArrayList<Integer> expected = encoded15Bits;
        assertEquals(expected, actual);
    }

    //Testing if it corrects no changes correctly
    @Test
    void correct15BitHammingCodeTest2(){
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
        ArrayList<Integer> encoded15Bits = code.encode11Bit();
        ArrayList<Integer> testList = encoded15Bits;
        ArrayList<Integer> actual = code.correct15BitHammingCode(testList);
        ArrayList<Integer> expected = encoded15Bits;
        assertEquals(expected, actual);
    }
}