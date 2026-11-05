import java.util.ArrayList;

public class HammingCode {
    private ArrayList<Integer> code;

    public HammingCode(ArrayList<Integer> code) {
        this.code = code;
    }


    /**
     * Encodes the 11 bits of data tha you are given
     * @return an arraylist of the encoded data
     */
    public ArrayList<Integer> encode11Bit() {

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
            list.remove(0);
            list.add(0, 1);
        }

        if (getParity2Sum(list)%2 != 0) {
            list.remove(1);
            list.add(1, 1);
        }

        if (getParity4Sum(list)%2 != 0) {
            list.remove(3);
            list.add(3, 1);
        }

        if (getParity8Sum(list)%2 != 0) {
            list.remove(7);
            list.add(7, 1);
        }

        return list;
    }

    /**
     * Outdated code that I was going to use to check the total sum of 16 bits of data to seeing if there were 2 errors within 11 bits of data sent.
     * @param list the 16 bits of data you wish to check.
     * @return an integer sum of the 16 bits.
     */
    public int getTotalSum(ArrayList<Integer> list){
        int sum = 0;
        for (Integer i: list) {
            sum += i;
        }
        return sum;
    }

    /**
     * Checks partiy bit 1 to see what the sum of bits are in that parity. Used in seeing if parity one has an error or what parity 1 needs to be for encoding and decoding hamming code.
     * @param list list of 15 bits you wish to check.
     * @return the sum of bits over parity 1 on the 15 bit list.
     */
    public int getParity1Sum(ArrayList<Integer> list) {
        int sum = 0;
        int index = 0;
        for (int i = index; i <= list.size(); i++) {
            if (i%2 == 0) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    /**
     * Checks partiy bit 2 to see what the sum of bits are in that parity. Used in seeing if parity one has an error or what parity 2 needs to be for encoding and decoding hamming code.
     * @param list list of 15 bits you wish to check.
     * @return the sum of bits over parity 2 on the 15 bit list.
     */
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

    /**
     * Checks partiy bit 4 to see what the sum of bits are in that parity. Used in seeing if parity one has an error or what parity 4 needs to be for encoding and decoding hamming code.
     * @param list list of 15 bits you wish to check.
     * @return the sum of bits over parity 4 on the 15 bit list.
     */
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

    /**
     * Checks partiy bit 8 to see what the sum of bits are in that parity. Used in seeing if parity one has an error or what parity 8 needs to be for encoding and decoding hamming code.
     * @param list list of 15 bits you wish to check.
     * @return the sum of bits over parity 8 on the 15 bit list.
     */
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

    /**
     * When given an arraylist of 15 bits it tells you what the syndrom is for that list.
     * @param hammingCode the arraylist of 15 bits you wish to check.
     * @return the syndrome in the form of an arraylist.
     */
    public ArrayList<Integer> syndrome(ArrayList<Integer> hammingCode) {
        ArrayList<Integer> syndrome = new ArrayList<>();


        if(getParity8Sum(hammingCode)%2 != 0) {
            syndrome.add(1);
        } else {
            syndrome.add(0);
        }

        if(getParity4Sum(hammingCode)%2 != 0) {
            syndrome.add(1);
        } else {
            syndrome.add(0);
        }

        if(getParity2Sum(hammingCode)%2 != 0) {
            syndrome.add(1);
        } else {
            syndrome.add(0);
        }

        if(getParity1Sum(hammingCode)%2 != 0) {
            syndrome.add(1);
        } else {
            syndrome.add(0);
        }

        return syndrome;
    }

    /**
     * decodes the syndrome to tell you which bit it refers to.
     * @param syndrome the syndrome in the form of an arraylist.
     * @return the integer the syndrome is referring to.
     */
    public int deCodeSyndrome(ArrayList<Integer> syndrome) {
        int result = 0;
        for (int bit : syndrome) {
            // Shift result left by 1 and use bitwise OR to add the current bit
            result = (result << 1) | bit;
        }
        return result;
    }


    /**
     * decodes an arraylist of 15 bits using hamming code to give you the correct 11 bits of data that was supposed to be sent. This can't detect more than 1 bit flipped.
     * @param hammingCode15Bit the arraylist of 15 bits that was received.
     * @return the correct code that was supposed to be sent in the form of an arraylist of 11 bits.
     */
    public ArrayList<Integer> deCode11Bit(ArrayList<Integer> hammingCode15Bit) {
        ArrayList<Integer> codeToReturn = new ArrayList<>();

        correct15BitHammingCode(hammingCode15Bit);

        codeToReturn.add(hammingCode15Bit.get(2));
        for (int i = 4; i <= 6; i++) {
            codeToReturn.add(hammingCode15Bit.get(i));
        }
        for (int i = 8; i < hammingCode15Bit.size(); i++) {
            codeToReturn.add(hammingCode15Bit.get(i));
        }

        return codeToReturn;

    }

    /**
     * Corrects and mistakes in an arraylist of 15 bits of data using hamming code. This code can't detect more than 1 bit flipped
     * @param code The arraylist of 15 bits you wish to check
     * @return the corrected arraylist of 15 bits.
     */
    public ArrayList<Integer> correct15BitHammingCode(ArrayList<Integer> code) {
        ArrayList<Integer> syndrome = syndrome(code);
        int intResultOfSyndrome = deCodeSyndrome(syndrome);

        if (intResultOfSyndrome != 0) {
            int indexErrorOccurred = intResultOfSyndrome - 1;
            if (code.get(indexErrorOccurred) == 1) {
                code.remove(indexErrorOccurred);
                code.add(indexErrorOccurred, 0);
            } else if (code.get(indexErrorOccurred) == 0) {
                code.remove(indexErrorOccurred);
                code.add(indexErrorOccurred, 1);
            }
        }
        return code;
    }



}
