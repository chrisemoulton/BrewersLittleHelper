/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.blh.core.units;

import blh.core.units.PH;
import org.junit.Test;

/**
 *
 * @author thinner
 */
public class PHTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testLowerThanZero() {
        new PH(-0.1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGreaterThan14() {
        new PH(14.1);
    }
    
    @Test
    public void testInRange() {
        new PH(7);
    }
}