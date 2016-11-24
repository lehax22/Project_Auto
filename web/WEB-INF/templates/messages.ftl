<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_user_profile.css">
    <link rel="stylesheet" href="/css/style_main.css">
    <link rel="stylesheet" href="/css/style_article.css">
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
    <div class="substrate container-fluid">
        <div class="row">
        <#if messages?has_content>
        <#list messages as message>
                <a class="comment col-xs-12" href="#">
                    <div class="row">
                        <img src="/img/user.png" class="avatar">
                        <div class="col-xs-6">
                            <h6 class="text-left"> ${message.send} </h6>
                        </div>
                        <div class="col-xs-6">
                            <h6 class="text-right"> last: ${message.time} </h6>
                        </div>
                        <div class="col-xs-12">
                            <p>${message.content}</p>
                        </div>
                </div>
            </a>
            <div class="col-xs-12">
                <div class="separator"></div>
            </div>
        </#list>
            <#else>
            <p align="center">List empthy</p>
        </#if>
        </div>
    </div>
</body>
</html>
