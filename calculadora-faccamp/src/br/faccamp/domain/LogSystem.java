package br.faccamp.domain;


 	 	

 	 	
import java.io.FileWriter;
 	 	
import java.io.IOException;
 	 
import java.io.PrintWriter;
 	 	
public class LogSystem {
 	 	
  public void Recorder(String result){
	  
	  FileWriter escritor;
 		
   try {
 	
     escritor = new FileWriter("log.csv", true);
 		
     PrintWriter imprimir = new PrintWriter(escritor);
 		
     imprimir.print(result);
 		
     imprimir.flush();
 		
     imprimir.close();
     
  }catch (IOException i) {
 		
      i.printStackTrace();
 		
   }
 	
  }
 	
}