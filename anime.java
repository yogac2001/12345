<html>
    <head><title></title>
        <style>
            .box{
                border:solid 2px gray;
                width: 200px;
                height:200px;
                margin:20px;
                padding-left: 5px;
                padding-top: 5px;
            }
            .animation{
                border: solid 2px rgb(111,35,35);
                background-color:bisque;
                width:50px;
                height:50px;
            }
            .animation{
                animation:animatio1 2sinfinite;
                position: realtive;
            }
            @keyframes animation1{
                0% {left:0;background-color: yellow;}
                25%{left:0;background-color: rgb(0,255,299);}
                100%{left:200px;background-color: red;}
            }

        </style>
</head>
<body>
    <!--box property-->
    <div clas="box">welcome welcome welcome</div>
    <!--animation property-->
    <div class="animation"></div>
</body>
</html>