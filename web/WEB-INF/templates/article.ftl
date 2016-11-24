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
    <div class="substrate">
        <div class="row">
            <div class="col-xs-12">
                <div class="row">
                    <div class="col-xs-4">
                        <div class="article-img-container large">
                            <img class="article-img" src="/img/background1.jpg">
                        </div>
                    </div>
                    <div class="col-xs-8 text-left">
                        <h5> The title of the article</h5>
                        <p>Anonymous</p>
                        <a>+</a>
                        <span>1</span>
                        <a>-</a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-xs-12">
                        <p class="article-content">
                            Likewise, permanent quantitative growth and scope of our activity allows us to estimate the value of forms of development. Thus a constant quantitative growth and scope of our activity contributes to the preparation and implementation of appropriate activation conditions. The task of organizing, especially the constant quantitative growth and scope of our activity is an interesting experiment verify positions held parties with respect to the tasks. Comrades! constant information and propaganda support of our activity contributes to the preparation and implementation of the positions taken by parties in relation to the tasks. Ideological considerations of the highest order, as well as continuous quantitative growth and scope of our activity is an interesting experiment verify positions held parties with respect to the tasks.
                        </p>
                        <p class="article-content">
                            The task of organizing, especially the constant information and propaganda support of our activities require the determination and refinement of significant financial and administrative conditions. It should not, however, forget that the further development of various forms of activity largely determines the creation of the system training, meets basic needs. Ideological considerations of the highest order, as well as the scope and place of learning provides a wide range of (specialists) participated in the formation of systems of mass participation. Ideological considerations of the highest order, as well as the implementation of the planned targets entails the process of introducing and upgrading forms of development. On the other side of the frame and place staff training contributes to the preparation and implementation of the system training, meets basic needs. Comrades! the beginning of the daily work on the formation position plays an important role in shaping the system training, meets basic needs.
                        </p>
                        <p class="article-content">
                            A varied and rich experience daily beginning work on the formation positions require determination and refinement of significant financial and administrative conditions. The importance of these problems is so obvious that the scope and location of training personnel largely determines the creation of the positions taken by parties in relation to the tasks. Varied and rich experience of consultation with a wide asset plays an important role in shaping the future direction of development.
                        </p>
                        <p class="article-content">
                            Thus the scope and place staff training is an interesting experiment testing areas of progressive development. Likewise, the implementation of the planned targets require the determination and refinement of new proposals. On the other hand the beginning of the daily work on the formation position is an interesting experiment verification forms of development.Everyday experience shows that further development of various forms of activity provides a wide range of (specialists) participated in shaping the system training, meets basic needs. Thus the constant information and propaganda support of our activities require the determination and refinement of areas of progressive development.
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="comment col-xs-12">
                <div class="row">
                    <img src="img/user.png" class="avatar">
                    <div class="col-xs-8">
                        <h6 class="text-left"> Ivan Ivanov </h6>
                    </div>
                    <div class="col-xs-4">
                        <a>+</a>
                        <span>23</span>
                        <a>-</a>
                    </div>
                    <div class="col-xs-12">
                        <p>Did not understand</p>
                    </div>
                </div>
            </div>
            <div class="comment minus col-xs-12">
                <div class="row">
                    <img src="img/user.png" class="avatar">
                    <div class="col-xs-8">
                        <h6 class="text-left"> Peter Petrov </h6>
                    </div>
                    <div class="col-xs-4">
                        <a>+</a>
                        <span>-1</span>
                        <a>-</a>
                    </div>
                    <div class="col-xs-12">
                        <p>The author write more</p>
                    </div>
                </div>
            </div>
            <div class="new-comment row">
                <div class="col-xs-12">
                    <textarea></textarea>
                </div>
                <div class="col-xs-12">
                    <button class="btn btn-info fl-right">Send</button>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
