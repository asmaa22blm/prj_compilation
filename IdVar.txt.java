/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compilation;

/**
 *
 * @author Lenono Y-50
 */
class IdVar {
    IdVar( ){
    }
    
    public int varID(String ident){
        int bool=1 ;
	
	switch(ident) {
	case "Snl_Start" : 
		bool =0; 
		break;
	case "Snl_Int" :
		bool =0; 
		break;
	case "Snl_Real" : 
		bool =0; 
		break;
	case "ShowMes" : 
		bool =0; 
		break;
	case "SnlSt" : 
		bool =0; 
		break;
	case "Set" : 
		bool =0; 
		break;
	case "Get" : 
		bool =0; 
		break;
	case "If" : 
		bool =0; 
		break;
	case "Else" : 
		bool =0; 
		break;
	case "Start" : 
		bool =0; 
		break;
	case "Finish" : 
		bool =0; 
		break;
		
	}
		
	if((Character.isLetter(ident.charAt(0))) || (Character.isUpperCase(ident.charAt(0)))){ 
	
            for (int i =1; (i< ident.length()) && (bool==1) ; i++){
                
                if((Character.isDigit(ident.charAt(i))) || (Character.isLetter(ident.charAt(i))) ||Character.isUpperCase(ident.charAt(i))) {
                    bool=1 ;
	        }
                
                else if(ident.charAt(i) == '_'){
                    if((Character.isDigit(ident.charAt(i+1))) || (Character.isLetter(ident.charAt(i+1))) || Character.isUpperCase(ident.charAt(i+1))) {
		         bool=1;
                    }
                }
                
	        else bool = 0;
		                    
            }
            
        }
        else bool = 0;
        
        //if(bool==1)System.out.println("valide");
        //else if(bool==0)System.out.println("non valide");
        
        return bool;
    }
}
