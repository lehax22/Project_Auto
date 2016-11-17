<!DOCTYPE html>
<html>
<head>
    <title>Sign up</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_signup.css">
    <script type="text/javascript">
        $(function () {
            $('#datetimepicker1').datetimepicker(
                    {pickTime: false, language: 'ru'}
            );
        });
    </script>
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
        <h4>Sign up</h4>
        <form role="form">
            <div class="form-group">
                <label for="login">Login</label>
                <input type="login" class="form-control" id="login" placeholder="Enter the login">
            </div>
            <div class="form-group">
                <label for="pass">Password</label>
                <input type="password" class="form-control" id="pass" placeholder="Enter the password">

            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="pass1" placeholder="Enter the password again">
            </div>
            <div class="form-group">
                <label for="pass">Name</label>
                <input type="name" class="form-control" id="name" placeholder="Enter the name">
            </div>
            <div class="form-group">
                <label for="surname">Last name</label>
                <input type="surname" class="form-control" id="surname" placeholder="Enter the last name">
            </div>
            <div class="form-group">
                <label class="radio-inline"><input type="radio" name="optradio">Male</label>
                <label class="radio-inline"><input type="radio" name="optradio">Female</label>
            </div>
            <div class="form-group">
                <label for="login">Birthdate</label>
                <div class="input-group date" id="datetimepicker1">
                    <input type="text" class="form-control" />
		    				<span class="input-group-addon">
		     				<span class="glyphicon glyphicon-calendar"></span>
		    				</span>
                </div>
            </div>
            <div class="form-group">
                <label for="experience">Experience</label>
                <input type="experience" class="form-control" id="experience" placeholder="Specify the driving experience (in years)">
            </div>
            <div class="form-group">
                <label for="cars">Personal cars</label>
                <textarea class="input-xlarge" id="cars" rows="3" placeholder="Enter here your existing personal cars"></textarea>
            </div>



            <button type="submit" class="btn btn-success">Sign up</button>
        </form>
    </div>
</div>


</body>
</html>