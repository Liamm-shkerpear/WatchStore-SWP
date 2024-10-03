<%@ page import="Model.Customer" %>
<link href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap" rel="stylesheet">

<!-- Css Styles -->
<link rel="apple-touch-icon" sizes="180x180" href="assets/img/favicons/apple-touch-icon.png">
<link rel="icon" type="image/png" sizes="32x32" href="assets/img/favicons/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16" href="assets/img/favicons/favicon-16x16.png">
<link rel="shortcut icon" type="image/x-icon" href="assets/img/favicons/favicon.ico">
<link rel="manifest" href="assets/img/favicons/manifest.json">
<meta name="msapplication-TileImage" content="assets/img/favicons/mstile-150x150.png">
<meta name="theme-color" content="#ffffff">


<link href="assets/css/theme.css" rel="stylesheet" />

<style>
    .avatar-navbar {
        width: 40px;
        height: 40px;
        border-radius: 50%;
        object-fit: cover;
        cursor: pointer;
    }

    .profile-dropdown {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
        z-index: 1;
    }

    .profile-dropdown ul {
        list-style-type: none;
        padding: 0;
        margin: 0;
    }

    .profile-dropdown ul li {
        padding: 12px 16px;
        text-decoration: none;
        display: block;
        cursor: pointer;
        text-align: left;
    }

    .profile-dropdown ul li:hover {
        background-color: #f1f1f1;
    }

    .profile-dropdown ul li a {
        text-decoration: none;
        color: black;
    }

    .profile-dropdown ul li a:hover {
        text-decoration: none;
        color: black;
    }


</style>

<%
    Customer account = (Customer) session.getAttribute("account");
%>

<nav class="navbar navbar-expand-lg navbar-light fixed-top py-3 d-block" data-navbar-on-scroll="data-navbar-on-scroll">
    <div class="container"><a class="navbar-brand d-inline-flex" href="/"><span class="text-light fs-2 fw-bold ms-2">Watch</span></a>
        <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
        <div class="collapse navbar-collapse border-top border-lg-0 mt-4 mt-lg-0" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item px-2"><a class="nav-link fw-bold active" aria-current="page" href="/">WATCHES</a></li>
                <li class="nav-item px-2"><a class="nav-link fw-bold" href="#store">STORE</a></li>
                <li class="nav-item px-2"><a class="nav-link fw-bold" href="#contact">CONTACT</a></li>
                <li class="nav-item px-2"><a class="nav-link fw-bold" href="#header">REQUEST VIRTUAL</a></li>
            </ul>
<%--            Profile and login--%>
            <ul class="navbar-nav ms-auto">
                <% if (account == null) { %>
                    <li class="nav-item px-2"><a class="nav-link fw-bold" href="login.jsp">LOGIN</a></li>
                    <li class="nav-item px-2"><a class="nav-link fw-bold" href="register.jsp">REGISTER</a></li>
                <% } else { %>
                    <li class="nav-item px-2"><img src="<%= account.getAvatar() %>" alt="avatar" class="avatar-navbar" id="avatar-navbar"></li>
                    <div class="profile-dropdown">
                        <ul>
                            <li><a href="profile">Profile</a></li>
                            <li><a href="logout">Logout</a></li>
                        </ul>
                    </div>
                <% } %>
            </ul>
        </div>
    </div>
</nav>


<script>
    document.getElementById("avatar-navbar").addEventListener("click", function () {
        document.getElementsByClassName("profile-dropdown")[0].style.display = "block";
    });

    document.addEventListener("click", function (e) {
        if (!e.target.matches('.avatar-navbar')) {
            var dropdowns = document.getElementsByClassName("profile-dropdown");
            for (var d of dropdowns) {
                d.style.display = 'none';
            }
        }
    });

</script>

<script src="vendors/@popperjs/popper.min.js"></script>
<script src="vendors/bootstrap/bootstrap.min.js"></script>
<script src="vendors/is/is.min.js"></script>
<script src="vendors/feather-icons/feather.min.js"></script>
<script>
    feather.replace();
</script>
<script src="assets/js/theme.js"></script>

<link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@300;700&amp;display=swap" rel="stylesheet">

