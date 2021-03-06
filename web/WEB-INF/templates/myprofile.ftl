<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_user_profile.css">
</head>
<body>
<div class="header">
    <div class="row">
        <h3>Header</h3>
    </div>
</div>
<div class="wrapper row">
    <div class="col-md-2 grey-menu">
        <ul class="nav nav-pills nav-stacked">
            <li>
            <#if current_user??>
                <a href="/main?id=${current_user.id}">Main</a>
            <#else>
                <a href="/login">Main</a>
            </#if>
            </li>
            <li>
                <a href="#">Interesting</a>
            </li>
            <li>
            <#if current_user??>
                <a href="/myprofile?id=${current_user.id}">My profile</a>
            <#else>
                <a href="/login">My profile</a>
            </#if>
            </li>
            <li>
            <#if current_user??>
                <a href="/messages?id=${current_user.id}">My messages</a>
            <#else>
                <a href="/login">My messages</a>
            </#if>
            </li>
            <li>
                <a href="#">My articles</a>
            </li>
        <#if current_user??>
            <li>
                <a href="/exit">Exit</a>
            </li>
        <#else>
            <li>
                <a href="/login">Log in</a>
            </li>
        </#if>
    </div>
    <div class="substrate">

        <div class="col-md-5 padding-t-90">
            <div class="nickname"><p>${user.login}</p></div>
            <div>
                <p>${user.lastname}</p>
                <p>${user.firstname}</p>
            </div>
            <div>
                <p>${user.male}</p>
                <p>${user.date}</p>
            </div>
            <div><p><span><b>Experience: </b></span>${user.driving_stage} years</p></div>
            <div><p>Personal cars:</p></div>
            <p>${user.car}</p>
            <!--<p>Toyota Land Cruiser 100</p>-->

        </div>
        <div class="col-md-3 padding-t-120">
            <div class="links">
                <div class="row">
                <#if current_user??>
                    <a href="/subscription?id=${current_user.id}">Subscriptions</a>
                <#else>
                    <a href="/main">Subscriptions</a>
                </#if>
                <div class="row">
                <#if current_user??>
                    <a href="/subscribers?id=${current_user.id}">Subscribers</a>
                <#else>
                    <a href="/main">Subscribers</a>
                </#if>
                </div>
                <div class="row"><a href="/redactor?id=${current_user.id}">Redactor</a></div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
