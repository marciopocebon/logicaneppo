<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Garçons Modernos</title>
        <script type="text/javascript" src="front-end/js/jquery.min.js"></script>
        
        	<script type="text/javascript">
		$(document).ready(function(){
			$('#calcular').click(function(event){
				var valor = $('#valor').val();	
					$.get('AjaxController',{valor:valor,action:'formula'},function(responseText) {
                        $('#saida').text(responseText);
                    });
					
				
				});
			});
		</script>
        
       <!-- Bootstrap core CSS -->
    <link href="front-end/css/bootstrap.min.css" rel="stylesheet">

    
    <!-- Custom styles for this template -->
    <link href="front-end/css/carousel.css" rel="stylesheet">
      
        
        
</head>
<body>

  <div class="navbar-wrapper">
      <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Testes Neppo</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="active"><a href="index.html">Home</a></li>
                
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Soluções <span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="formula.jsp">Fórrmula Misteriosa</a></li>
                    <li><a href="garcon.jsp">Garçons Modernos</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </nav>

      </div>
    </div>

<table width="40%" border="1">
  <thead>
      <tr>
        <th>Entrada </th>
        <th>Saída</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1</td>
        <td>11</td>
      </tr>
      <tr>
        <td>11</td>
        <td>21</td>
      </tr>
      <tr>
        <td>21</td>
        <td>1211</td>
      </tr>
      <tr>
        <td>1211</td>
        <td>111221</td>
      </tr>
      <tr>
        <td>111221</td>
        <td>312211</td>
      </tr>
      
      
      
      
    </tbody>
  </table>






<form id="form1">
<h1>Fórmula Mágica</h1>
Entre com o  Valor:
<input type="number" id="valor"/>
<input type="button" id="calcular" value="Calcular" class="btn btn-success" />
<br/>
<div id="saida"></div>
</form>
 	<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <script src="front-end/js/bootstrap.min.js"></script>
	
</body>
</html>


   	

