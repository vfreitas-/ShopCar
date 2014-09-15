/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopcar.util;

import java.util.Scanner;
import javax.inject.Inject;

/**
 *
 * @author Vitor Freitas
 */
public class Util
{
    @Inject private Scanner s;
    
    public int testInput(String pattern) throws Exception
    {   
        int test;
        if(s.hasNext(pattern))
        {
            test = s.nextInt();
            clear();
            return test;
        }
        else
            throw new Exception("Opção errada!"); 
    }
    
    public void clear() 
    {
        for (int i = 0; i < 40; ++i) System.out.println();
    }
}
