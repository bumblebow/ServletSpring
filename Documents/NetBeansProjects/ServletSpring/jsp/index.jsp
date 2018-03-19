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
              <a href="#" class="brand-logo">Logo</a>
              <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="sass.html">Sass</a></li>
                <li><a href="badges.html">Components</a></li>
                <li><a href="collapsible.html">JavaScript</a></li>
              </ul>
            </div>
        </nav>
        <% if(request.getAttribute("error") != null) { %>

        <div>
            <h1><%=request.getAttribute("error")%></h1>
        </div>
        <% } %>
        <div class="container row">
            <form class="col s12" method="POST" action="./loginservice">
              <div class="row">
                <div class="input-field col s12">
                  <input placeholder="Place your user id" id="first_name" type="text" class="validate" name="userid">
                  <label for="first_name">First Name</label>
                </div>
                
              </div>
              
              <div class="row">
                <div class="input-field col s12">
                  <input placeholder="Password" id="password" type="password" class="validate" name="psw">
                  <label for="password">Password</label>
                </div>
              </div>

              <div class="row">
                <div class="col s12">
                    <button class="btn waves-effect waves-light" type="submit">
                        <i class="material-icons left">lock_open</i>Login
                    </button>
                </div>
              </div>
            </form>
         </div>
        
    </body>
  </html>