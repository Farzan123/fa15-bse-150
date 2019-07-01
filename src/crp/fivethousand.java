/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crp;

/**
 *
 * @author fa15-bse-150
 */
public class fivethousand implements dispense{
    
    private dispense chain;
	
	@Override
	public void setNextChain(dispense nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(currency cur) {
		if(cur.getAmount() >= 5000){
			int num = (cur.getAmount()/5000)-1;
			int remainder = (cur.getAmount() % 5000)+5000;
			System.out.println("Dispensing "+num+" 5000 note");
			if(remainder >=0) this.chain.dispense(new currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
	}
    
}
