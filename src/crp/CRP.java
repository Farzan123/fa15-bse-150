/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crp;

import java.util.Scanner;
import jdk.Exported;

/**
 *
 * @author fa15-bse-150
 * @version 2.01
 * @since 2009
 * @Deprecated This will not work in version above 1.6
 */
public class CRP {
    
    private dispense c1;
	public CRP() {
          
		// initialize the chain
		this.c1 = new fivethousand();
		dispense c2 = new thousand();
		dispense c3 = new fivehundred();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CRP atmDispenser = new CRP();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount ");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 500 != 0) {
				System.out.println("Amount should be in multiple of 500.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new currency(amount));
		}

	
    }
    
}
