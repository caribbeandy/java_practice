<?php

function test($a) {
    $a[0] = 9999999;
}

$a = [5,4,3,2,1];

test($a);



print_r($a);
