<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_user_profile.css">
    <link rel = "stylesheet" href = "/css/style_subscribers.css">
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
    <#if users?has_content>
    <#list users as user>
    <div class="substrate">
        <div class="subscriber">
            <div class="row">
                <div class="col-md-3">
                    <img class="user-img-small"src="/img/user.png">
                    <div><p class="text-center nickname-small">${user.login}</p></div>
                </div>
                <div class="col-md-5">
                    <div>
                        <p>${user.lastname}</p>
                        <p>${user.firstname}</p>
                    </div>
                    <div>
                        <p>${user.male}</p>
                        <p>${user.date}</p>
                    </div>
                    <div>
                        <p><span><b>Experience: </b></span>${user.driving_stage} years</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div><p>Personal cars:</p></div>
                    <p>${user.car}</p>
                    <form action="/subscription?id=${current_user.id}&del=${user.id}" method="post">
                        <button type="button" class="btn btn-warning btn-lg fl-left" onclick="location.href='/unfollow?id=${current_user.id}&del=${user.id}'">Unfollow</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    </#list>
    <#else>
    <div class="substrate">
        <div class="subscriber">
            <div class="row">
                I'm sorry! The list is empty!
            </div>
        </div>
    </div>
    </#if>
</div>
</body>
</html>
