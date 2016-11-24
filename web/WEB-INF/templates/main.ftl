<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <meta charset="UTF-8">
    <link rel = "stylesheet" href = "/css/bootstrap.css">
    <link rel = "stylesheet" href = "/css/style_user_profile.css">
    <link rel="stylesheet" href="/css/style_main.css">
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
        <div class="row">
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background2.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background2.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background2.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background2.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>
            <div class="col-xs-6">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container">
                            <img class="article-img" src="/img/background2.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                            <p>Article rating</p>
                    </div>
                </div>
            </div>

        </div>
        <nav aria-label="..." class="page-nav">
            <ul class="pager">
                <li class="previous"><a href="#"><span aria-hidden="true">&larr;</span> Prev.</a></li>
                <li class="num"><span aria-hidden="true">120</span></li>
                <li class="next"><a href="#">Next <span aria-hidden="true">&rarr;</span></a></li>
            </ul>
        </nav>
    </div>
</body>
</html>
