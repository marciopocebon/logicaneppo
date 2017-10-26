package br.com.testesneppo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.testesneppo.entidades.Formula;
import br.com.testesneppo.entidades.Garcons;


@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxController() {
        super();
       
    }

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  
    	  String valor=null;
    	  String action = null;
    	  
    	  valor = request.getParameter("valor"); // pega o valor passado no campo
    	  action = request.getParameter("action");
    	  
    	  //TRATA APENAS DE 2 ACTIONS - VALOR ou Formula
    	  
    	  if(action.equals("garcon")){
    		  int val = Integer.parseInt(valor);
        	  
        	  String romano = Garcons.decimalParaRomano(val);
        	  System.out.println(romano);
        	  
        	  if(request.getParameter("valor").toString().equals("")){
        		  valor="Romano";
        	  }
        	  response.setContentType("text/plain");
        	  response.setCharacterEncoding("UTF-8");
        	  response.getWriter().write("Romano: "+romano);
        	 
    	  	}else{
    	  		long val = Integer.parseInt(valor);
    	  		String desc = Formula.aplicarFormula(val);
    	  		
    	  		 if(request.getParameter("valor").toString().equals("")){
           		  valor="Formula";
           	  }
           	  response.setContentType("text/plain");
           	  response.setCharacterEncoding("UTF-8");
           	  
           	
           	Long saida = Formula.verificaNuns(desc);  
           	
          
           	 response.getWriter().write("Saída: "+saida);

        	 }
    	  }
    	  
    	  
	
	
		
	}

//}
