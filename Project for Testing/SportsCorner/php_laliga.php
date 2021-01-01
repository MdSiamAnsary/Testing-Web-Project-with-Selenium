<?php
session_start();
if(!isset($_SESSION['username'])){
  header('location:index.php');

}

$user = $_SESSION['username'];

include_once('dbcon.php');



$command = escapeshellcmd('python soccerlaliga.py');
$output = shell_exec($command);



?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>La Liga</title>
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
  </header>

  <main id="individualleague1">

    
    <section id="laliga" class="laliga">

      <div class="container" data-aos="fade-up">

        <div class="section-title">
          <br>
          <h2 id="leaguename1">La Liga</h2>

          <ul id="leaguedescription1" class="list-group">
            <li id="lg1info1" class="list-group-item list-group-item-primary" style="text-align: justify;">
              <strong>
                Qualification for UEFA Champions League
              </strong>
              The top four teams in La Liga qualify for the subsequent season's UEFA Champions League group stage. 
              The winners of the UEFA Champions League and UEFA Europa League also qualify for the subsequent season's UEFA Champions League group stage. 
              If this means 6 La Liga teams qualify, then the 4th place team in La Liga instead plays in the UEFA Europa League, as any single nation is limited to a maximum of 5 teams.
            </li>


            <li id="lg1info2" class="list-group-item list-group-item-primary" style="text-align: justify;">
              <strong>
                Relegation and Promotion System
              </strong>
              A system of promotion and relegation exists between the Primera Division and the Segunda Division. 
              The three lowest placed teams in La Liga are relegated to the Segunda Division, 
              and the top two teams from the Segunda Division promoted to La Liga, 
              with an additional club promoted after a series of play-offs involving the third, fourth, fifth and sixth placed clubs.
            </li>
          </ul>
          
        </div>

        <div class="section-title">
          <p id="seasontext" style="font-family: Cambria; font-size: 1.5em; font-style: bold; color: #000;">
            2020-21 Season Table Standings
          </p>
        </div>

        

        <?php

          echo "<div class='container>'";

          echo "<html><body><table id='indtabone' align = 'center' class=\"table table-hover\" style='max-width: 80%;'>\n";

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
          while (($line = fgetcsv($f)) !== false) 
          {
            echo "<tr>";
            foreach ($line as $cell) {
              echo "<td>" ;
              echo htmlentities($cell,ENT_QUOTES | ENT_IGNORE | ENT_SUBSTITUTE | ENT_DISALLOWED | ENT_HTML401 | ENT_XML1 | ENT_XHTML | ENT_HTML5, "ISO-8859-1");
              echo "</td>";
            }
            echo "</tr>\n";
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