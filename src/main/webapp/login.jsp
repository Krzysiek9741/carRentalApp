<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://fonts.googleapis.com/css?family=Rubik+Mono+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="styles/style.css">
    <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
--%>
</head>
<body>
<header>CAR RENTAL</header>
<ul>
    <li><a href="index.jsp">Home</a></li>
    <li><a href="list">List of cars</a></li>
    <li><a href="addCar.jsp">Add new car</a></li>
    <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>

<div id="container">
    <div id="main">
        <h3>Sign in</h3>
        <div class="login">
            <div class="heading">
                <form method="POST" action="j_security_check">

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input style="font-size: 20px" type="text" name="j_username" class="form-control" placeholder="Username">
                    </div>

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input style="font-size: 20px" type="password" name="j_password" class="form-control" placeholder="Password">
                    </div>
                    <br>

                    <button style="font-size: 20px" type="submit" class="float">Login</button>
                </form>
            </div>
        </div>
    </div>
</div>

<footer id="footer">&copy; 2019 Krzysztof Falkowski</footer>

<%--
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

--%>

</body>
</html>