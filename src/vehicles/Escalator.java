/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import retail.Trademarked;

public class Escalator extends FixedPathVehicle implements Trademarked {

    @Override
    public String mark() {
        return "Escalator";
    }

    @Override
    public String markWithASCII() {
        return this.mark() + "(TM)";
    }

    @Override
    public String markWithHTML() {
        return this.mark() + "&trade;";
    }

    @Override
    public String markWithUnicode() {
        return this.mark() + "\u2122";
    }
    
}
