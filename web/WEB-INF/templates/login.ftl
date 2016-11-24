<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_login.css">
</head>
<body>
<div class="header">
    <div class="row">
        <img src="img/logo.jpg">
        <h3>Header</h3>
    </div>
</div>
<div class="substrate">
    <div class="wrapper">
        <h4>Login</h4>
        <form role="form" method="post" action="/login">
            <div class="form-group">
                <label for="login">Login</label>
                <input type="text" name="username" class="form-control" id="login" placeholder="Enter login">
            </div>
            <div class="form-group">
                <label for="pass">Password</label>
                <input type="password" name="password" class="form-control" id="pass" placeholder="Enter password">

                <div class="row">
                    <button type="submit" class="btn btn-success">Log in</button>
                    <button type="submit" class="btn btn-default">Cancel</button>
                </div>
        </form>
    </div>
</div>


</body>
</html>