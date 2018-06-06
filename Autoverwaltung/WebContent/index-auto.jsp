<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Test</title>
    <link rel="stylesheet" href="css.css">
    <script language="javascript" type="text/javascript" src="javascript.js"></script>
</head>
<body>

<div class="wrapper">
    <div class="container">
        <div class="header">
            <div class="headline-title">
                <h1 class="headline-text">Autoverwaltungstool</h1>
            </div>
            <div class="sign">
                <form action="loginUser" method="post">
                    <input class="input-field" type="text" name="text" placeholder="Benutzername oder E-Mail">
                    <input class="input-field" type="password" name="password" placeholder="Password">
                    <button type="submit" class="button" name="Submit">Anmelden</button>

                </form>

                <div class="forget-password">
                    <a href="http://www.google.de">Passwort vergessen?</a>

                </div>
            </div>
        </div>

        <div class="auto-body">
            <div class="left-part">

            </div>

            <div class="register">
                <div class="register-container">
                    <div class="register-title">
                        <h2>Registrieren</h2>
                    </div>
                    <div class="register-fields">
                        <form class="" action="" method="post">
                            <input class="input-field-register" type="text" name="id" placeholder="Benutzername">
                            <input class="input-field-register" type="text" name="email" placeholder="E-Mail-Adresse">
                            <input class="input-field-register" type="password" name="pwd" placeholder="Password">
                            <button type="submit" class="register-button" name="fahrzeugbestand">Registrieren</button>

                        </form>
                    </div>

                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>