/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retail;

public interface Trademarked {
    
    String mark();
    
    default String markWithASCII() {
        return this.mark() + "?";
    }
    
    default String markWithHTML() {
        return this.mark() + "?";
    }
    
    default String markWithUnicode() {
        return this.mark() + "?";
    }
    
}
