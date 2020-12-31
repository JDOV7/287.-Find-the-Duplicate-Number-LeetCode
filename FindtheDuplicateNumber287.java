package leetcode;

import java.util.Vector;

public class FindtheDuplicateNumber287 {

    public void FindtheDuplicateNumber287() {
        int nums[] = {1, 3, 4, 2, 2};
        Vector<Integer> vListNumbers = new Vector();
        int iNumber = 0;
        for (int num : nums) {
            if (vListNumbers.indexOf(num) == -1) {
                vListNumbers.add(num);
            } else {
                iNumber = num;
                break;
            }
        }
//        return iNumber;
    }
}
