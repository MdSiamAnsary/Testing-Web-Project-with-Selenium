<?php
session_start();
if(!isset($_SESSION['username'])){
  header('location:index.php');

}

$user = $_SESSION['username'];

include_once('dbcon.php');


?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Home</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  
  <link rel="icon" href="images/icon.png" type="image/x-icon" />

  
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/css/style.css" rel="stylesheet">

 
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top">
    <div class="container d-flex align-items-center">
      <h1 style="font-family: LORA" class="logo mr-auto">
        <!-- <a href="home.php"> -->
        <?php

          $con=mysqli_connect("127.0.0.1","root","","sportscornerdb");
          $query="Select * from userstable where username='$user'";
          $result= mysqli_query($con,$query);

          while($row = mysqli_fetch_array($result))
          {
            echo "".$row["username"]."<br>";  
          }

        ?>
        <!-- </a> -->
      </h1>
        
      <nav class="nav-menu d-none d-lg-block">
        <ul>
          <li><a id="navl1" href="home.php">Home</a></li>
          <li><a id="navl2" href="php_laliga.php">La Liga</a></li>
          <li><a id="navl3" href="php_epl.php">EPL</a></li>
          <li><a id="navl4" href="php_bundesliga.php">Bundesliga</a></li>
          <li><a id="navl5" href="php_ligueone.php">Ligue 1</a></li>
          <li><a id="navl6" href="php_seriea.php">Serie A</a></li>
        </ul>
      </nav>
      <a id="logout" href="logout.php" class="get-started-btn scrollto">LOG OUT</a>
    </div>
  </header><!-- End Header -->

 
  <section id="intro" class="d-flex align-items-center">
    <div class="container position-relative" data-aos="fade-up" data-aos-delay="100">
      <div class="row justify-content-center">
        <div class="section-title">
          <br>
          
          <h2 id="siteid">Sports Corner</h2>
          <h5 id="cruyffquoteid"><q>Soccer is simple, but it is difficult to play simple.</q> - Johan Cruyff</h5>
          <p id="sitedescription" style="color: #000; font-size: 1.2em; font-family: lora ">
            The most popular sport in world is football (which Americans call Soccer!). 
            Estimated number of fans of this sport is about 3.5 Billion.
            On this site, you can check out the current positions of the teams of the top five football leagues in the world. 
          </p>
        </div>
      </div>
    
    </div>
  </section>

  <main id="allleagues">

    
    <section id="laliga" class="laliga">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2 id="leaguename1">La Liga</h2>
          <p  id="leaguedescription1">Here are the top four current teams of La Liga. For the whole table, go to the La Liga page.</p>
        </div>

        <?php

          echo "<div class='container>'";

          echo "<html><body><table id='alltabone' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";


          echo "<tr>";
          echo "<th> Team </th>";
          echo "<th> Position </th>";
          echo "<th> Points </th>";
          echo "<th> Matches Played </th>";
          echo "<th> Wins </th>";
          echo "<th> Losses </th>";
          echo "<th> Goals For </th>";
          echo "<th> Goal Difference </th>";
          echo "</tr>";

          $f = fopen("txt_laliga.txt", "r");

          $itr = 1 ;

          while (($line = fgetcsv($f)) !== false) 
          {

            if($itr <= 4)
            {
              echo "<tr>";
              foreach ($line as $cell) 
              {
                echo "<td>" ;
                echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
                echo "</td>";
              }
              echo "</tr>\n";

              $itr = $itr + 1 ;
            }

          }

    
          fclose($f);
          echo "\n</table></body></html>";
          echo "</div>";

        ?>
      </div>
    </section> 





     <section id="epl" class="epl">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2 id="leaguename2">English Premier League</h2>
          <p  id="leaguedescription2">Here are the top four current teams of English Premier League. For the whole table, go to the league page.</p>
        </div>

        <?php

          echo "<div class='container>'";

          echo "<html><body><table id='alltabtwo' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";

          echo "<tr>";
          echo "<th> Team </th>";
          echo "<th> Position </th>";
          echo "<th> Points </th>";
          echo "<th> Matches Played </th>";
          echo "<th> Wins </th>";
          echo "<th> Losses </th>";
          echo "<th> Goals For </th>";
          echo "<th> Goal Difference </th>";
          echo "</tr>";

          $f = fopen("txt_epl.txt", "r");

          $itr = 1 ;

          while (($line = fgetcsv($f)) !== false) 
          {

            if($itr <= 4)
            {
              echo "<tr>";
              foreach ($line as $cell) 
              {
                echo "<td>" ;
                echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
                echo "</td>";
              }
              echo "</tr>\n";

              $itr = $itr + 1 ;
            }
            
          }

    
          fclose($f);
          echo "\n</table></body></html>";
          echo "</div>";

        ?>
      </div>
    </section> 

  </main>




  <section id="bundesliga" class="bundesliga">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2 id="leaguename3">Bundesliga</h2>
          <p  id="leaguedescription3">Here are the top four current teams of Bundesliga. For the whole table, go to the league page.</p>
        </div>

        <?php
          

          echo "<div class='container>'";

          echo "<html><body><table id='alltabthree' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";

          echo "<tr>";
          echo "<th> Team </th>";
          echo "<th> Position </th>";
          echo "<th> Points </th>";
          echo "<th> Matches Played </th>";
          echo "<th> Wins </th>";
          echo "<th> Losses </th>";
          echo "<th> Goals For </th>";
          echo "<th> Goal Difference </th>";
          echo "</tr>";

          $f = fopen("txt_bundesliga.txt", "r");
          
          $itr = 1 ;

          while (($line = fgetcsv($f)) !== false) 
          {

            if($itr <= 4)
            {
              echo "<tr>";
              foreach ($line as $cell) 
              {
                echo "<td>" ;
                echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
                echo "</td>";
              }
              echo "</tr>\n";

              $itr = $itr + 1 ;
            }
            
          }

    
          fclose($f);
          echo "\n</table></body></html>";
          echo "</div>";

        ?>
      </div>
    </section> 


    <section id="ligueone" class="ligueone">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2 id="leaguename4">League 1</h2>
          <p  id="leaguedescription4">Here are the top four current teams of League One. For the whole table, go to the league page.</p>
        </div>

        <?php
         

          echo "<div class='container>'";

          echo "<html><body><table id='alltabfour' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";

          echo "<tr>";
          echo "<th> Team </th>";
          echo "<th> Position </th>";
          echo "<th> Points </th>";
          echo "<th> Matches Played </th>";
          echo "<th> Wins </th>";
          echo "<th> Losses </th>";
          echo "<th> Goals For </th>";
          echo "<th> Goal Difference </th>";
          echo "</tr>";

          $f = fopen("txt_ligueone.txt", "r");
          
          $itr = 1 ;

          while (($line = fgetcsv($f)) !== false) 
          {

            if($itr <= 4)
            {
              echo "<tr>";
              foreach ($line as $cell) 
              {
                echo "<td>" ;
                echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
                echo "</td>";
              }
              echo "</tr>\n";

              $itr = $itr + 1 ;
            }
            
          }

    
          fclose($f);
          echo "\n</table></body></html>";
          echo "</div>";

        ?>
      </div>
    </section> 

    <section id="seriea" class="seriea">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <h2 id="leaguename5">Serie A</h2>
          <p  id="leaguedescription5">Here are the top four current teams of Serie A. For the whole table, go to the league page. </p>
        </div>

        <?php
         

          echo "<div class='container>'";

          echo "<html><body><table id='alltabfive' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";

          echo "<tr>";
          echo "<th> Team </th>";
          echo "<th> Position </th>";
          echo "<th> Points </th>";
          echo "<th> Matches Played </th>";
          echo "<th> Wins </th>";
          echo "<th> Losses </th>";
          echo "<th> Goals For </th>";
          echo "<th> Goal Difference </th>";
          echo "</tr>";

          $f = fopen("txt_seriea.txt", "r");
          
          $itr = 1 ;

          while (($line = fgetcsv($f)) !== false) 
          {

            if($itr <= 4)
            {
              echo "<tr>";
              foreach ($line as $cell) 
              {
                echo "<td>" ;
                echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
                echo "</td>";
              }
              echo "</tr>\n";

              $itr = $itr + 1 ;
            }
            
          }
    
          fclose($f);
          echo "\n</table></body></html>";
          echo "</div>";

        ?>
      </div>
    </section> 

  </main>

  <script src="assets/vendor/jquery/jquery.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>
  <script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="assets/vendor/counterup/counterup.min.js"></script>
  <script src="assets/vendor/venobox/venobox.min.js"></script>
  <script src="assets/vendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="assets/vendor/aos/aos.js"></script>
  <script src="assets/js/main.js"></script>

</body>

</html>