<?php

    $conection__db = mysqli_connect('localhost:3307', 'root', 'Garfield12','pescados');
    $resultado = mysqli_query($conection__db, "SELECT * FROM peixes");
    $dados = array();

    while( $registro = mysqli_fetch_assoc($resultado) ){
        array_push($dados, $registro);
    };

    $json = json_encode($dados);
    echo $json;

?>