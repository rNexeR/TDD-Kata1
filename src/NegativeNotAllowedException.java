/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnexer
 */
class NegativeNotAllowedException extends Exception {

    public NegativeNotAllowedException(String negatives) {
        super(negatives);
    }
    
}
