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
public interface dispense {
    
    void setNextChain(dispense nextChain);
	
	void dispense(currency cur);
    
}
