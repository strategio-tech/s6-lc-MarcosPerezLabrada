package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param int amount that represents the original debt
     * @return int that represents the remaining amount after 3 Months paying 10% of the monthly balance.
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remaining= amount;
        for(int i = 0; i < 3 ; i++)
        {
            remaining = remaining- (int)( 0.1 *remaining);
        }
        return remaining;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
