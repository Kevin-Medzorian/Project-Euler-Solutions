

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kevin
 */
public class euler043 {

    public static void main(String[] args) {

        ArrayList<String> pandigitals = new ArrayList<>();
        int temp = 0;
        int minusFirst = 0;
        for (int i = 100; i < 1000; i += 2) {
            int[] nums = new int[10];

            nums[3] = i % 10;
            nums[2] = ((i % 100) - nums[3]) / 10;
            nums[1] = ((i % 1000) - nums[2] - nums[3]) / 100;
            for (int j = 0; j < 10; j++) {

                nums[4] = j;
                if ((nums[2] * 100 + nums[3] * 10 + nums[4]) % 3 == 0) {

                    for (int k = 0; k < 10; k += 5) {
                        nums[5] = k;

                        for (int l = 0; l < 10; l++) {
                            nums[6] = l;

                            if ((nums[4] * 100 + nums[5] * 10 + nums[6]) % 7 == 0) {

                                for (int m = 0; m < 10; m++) {
                                    nums[7] = m;

                                    if ((nums[5] * 100 + nums[6] * 10 + nums[7]) % 11 == 0) {

                                        for (int n = 0; n < 10; n++) {
                                            nums[8] = n;

                                            if ((nums[6] * 100 + nums[7] * 10 + nums[8]) % 13 == 0) {

                                                for (int o = 0; o < 10; o++) {
                                                    nums[9] = o;

                                                    if ((nums[7] * 100 + nums[8] * 10 + nums[9]) % 17 == 0) {

                                                        String num = "";
                                                        String regex = "9876543210";

                                                        for (int p = 1; p < 10; p++) {
                                                            num += "" + nums[p];
                                                        }

                                                        boolean nope = true;

                                                        for (char c : num.toCharArray()) {

                                                            if (num.indexOf("" + c) != num.lastIndexOf("" + c)) {
                                                                nope = false;
                                                                break;
                                                            }
                                                            regex = regex.replace("" + c, "");
                                                        }

                                                        if (nope && !pandigitals.contains(num)) {
                                                            pandigitals.add(regex + num);
                                                            System.out.println("Added: " + num);
                                                        }

                                                    }

                                                }
                                            }

                                        }
                                    }

                                }
                            }
                        }

                    }
                }
            }
        }

        long sum = 0l;
        for (String pandigital : pandigitals) 
            sum += Long.parseLong(pandigital);
        
        System.out.println("Final Answer: "+sum);
    }

}
