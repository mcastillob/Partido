/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author Miguel Castillo
 */
public class RutUtil {
    
    public static boolean validaRut(String rut){
      try{
        
        rut=rut.replace(".","");
        String[] arrayRut=rut.split("-");
    
        if(arrayRut.length==2){
           return ValidarRut(Integer.parseInt(arrayRut[0]), arrayRut[1].charAt(0));
        }
      }catch(Exception error){
      
      
      }
        return false;
    
    }
    
  
     public static boolean ValidarRut(int rut, char dv)
    {
        int m = 0, s = 1;
        for (; rut != 0; rut /= 10)
        {
            s = (s + rut % 10 * (9 - m++ % 6)) % 11;
        }
        return dv == (char) (s != 0 ? s + 47 : 75);
    }
    
}
