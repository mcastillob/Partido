/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import modelo.DirectorTecnico;

/**
 *
 * @author Miguel Castillo
 * @param 
 */
public  class SerializadorUtil<T> {
       
        private File file;    

        SerializadorUtil(Class tipo) {
            file=new File(tipo.getName()+".dat");
        }

 
        public  T readObj() {
    	T obj = null;
        try  {
        	        
        	if(file.exists()){        	
        	ObjectInputStream st      = new ObjectInputStream(new FileInputStream(file));
                obj=(T)st.readObject();
          
            st.close();            
        	}
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
        
        
        
        public void writeObj(Serializable obj) {

        try  {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));
            os.writeObject(obj);
            os.flush();
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}