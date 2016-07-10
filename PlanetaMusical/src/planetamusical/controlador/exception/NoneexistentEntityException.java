/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetamusical.controlador.exception;

/**
 *
 * @author sandrojc
 */
public class NoneexistentEntityException  extends Exception{
    public NoneexistentEntityException(String message, Throwable cause){
         super(message, cause);
    }
    
   public NoneexistentEntityException(String message){
       super(message); 
   }
}
