
<%@ page import="java.util.*" %>

<html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!-- Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

  
          

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
      <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <!-- Compiled and minified JavaScript -->
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
      
        <nav>
            <div class="nav-wrapper">
              <a href="#" class="brand-logo">List User</a>
            </div>
        </nav>
        <% ArrayList<Map> userdata = (ArrayList<Map>)request.getAttribute("userdata"); %>
        <table>
        <% for(int i=0;i<userdata.size();i++){ %>
        <tr>
            <td></td>
        </tr>
        <% } %>
    </body>
  </html>
