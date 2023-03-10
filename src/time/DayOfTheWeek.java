/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 * Represents a day of the week. This is only for the sake of illustration. For 
 * actual production work, use <code>java.time.DayOfTheWeek</code> instead.
 * @author Alonso del Arte
 */
public enum DayOfTheWeek {
    
    SUNDAY("SUN"), MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), 
    THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT");
    
    private final String threeLetterAbbrev;
    
    public String getAbbreviation() {
        return "SORRY, NOT IMPLEMENTED YET";
    }
    
    public int getISO8601Value() {
        int ord = this.ordinal();
        int ordAdjustSunday = ord == 0 ? 7 : 0;
        return ord + ordAdjustSunday;
    }
    
    DayOfTheWeek(String abbrev) {
        this.threeLetterAbbrev = abbrev;
    }
    
}
