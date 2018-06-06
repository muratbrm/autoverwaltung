<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fahrzeugbestand</title>
    <link rel="stylesheet" href="css.css">
    <script language="javascript" type="text/javascript" src="javascript.js"></script>
</head>
<body>

<div class="wrapper">

    <div class="header">
        <div class="headline-title">
            <h1 class="headline-text">Autoverwaltungstool</h1>
        </div>

        <div class="signout">
            <form action="loginUser" method="post">
                <button type="submit" class="button-logout" name="Submit">Abmelden</button>
            </form>
        </div>
    </div>


    <form class="" action="insertAuto" method="get">
    <div class="car-content">


            <div class="label">
                <div class="label-fin">
                    <label class="label-fin">FIN</label>
                </div>

                <div class="input-fin">
                    <input class="input-field" type="text" name="fin">
                </div>
            </div>

            <div class="label">
                <div class="label-fin">
                    <label class="label-fin">Baujahr</label>
                </div>

                <div class="input-fin">
                    <input class="input-field" type="text" name="datum">
                </div>
            </div>

            <div class="label">
                <div class="label-fin">
                    <label class="label-fin">Motor</label>
                </div>

                <div class="input-fin">
                    <input class="input-field" type="text" name="motor">
                </div>
            </div>

            <div class="label">
                <div class="label-fin">
                    <label class="label-fin">Türen</label>
                </div>

                <div class="input-fin">
                    <input class="input-field" type="text" name="tueren">
                </div>
            </div>

            <div class="label">
                <div class="label-fin">
                    <label class="label-fin">Leistung</label>
                </div>

                <div class="input-fin">
                    <input class="input-field" type="text" name="leistung">
                </div>
            </div>

        <div class="label">
            <div class="label-fin">
                <label class="label-fin">Fahrzeugsart</label>
            </div>

            <div class="input-fin">
                <input class="input-field" type="text" name="fahrzeugart">
            </div>
        </div>

        <div class="label">
            <div class="label-fin">
                <label class="label-fin">Sitze</label>
            </div>

            <div class="input-fin">
                <input class="input-field" type="text" name="sitze">
            </div>
        </div>

        <div class="label">
            <div class="label-fin">
                <label class="label-fin">Ausstattung</label>
            </div>

            <div class="input-fin">
                <input class="input-field" type="text" name="austattungen">
            </div>
        </div>

        <div class="label">
            <div class="label-fin">
                <label class="label-fin">Preis</label>
            </div>

            <div class="input-fin">
                <input class="input-field" type="text" name="preis">
            </div>
        </div>

        <div class="label">
            <div class="label-fin">
                <label class="label-fin">Modell</label>
            </div>

            <div class="input-fin">
                <input class="input-field" type="text" name="modell">
            </div>
        </div>

        <div class="label">
            <button type="submit" class="register-button" name="delete">Fahrzeug anlegen</button>
        </div>

    </div>
    </form>




</div>



</body>
</html>