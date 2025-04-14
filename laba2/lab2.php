<?php
function searchColor($r) {
    if (strlen($r) % 2 !== 0) {
        echo "Incorrect value\n";
        return 0;
    }

    $vecR = array_fill(0, 10, 0);
    $vecW = array_fill(0, 10, 0);
    $vecB = array_fill(0, 10, 0);
    $c = 0;

    for ($i = 0; $i < strlen($r); $i += 2) {
        $color = $r[$i];
        $cod = intval($r[$i + 1]);

        if ($color === 'R') $vecR[$cod] = 1;
        elseif ($color === 'W') $vecW[$cod] = 1;
        elseif ($color === 'B') $vecB[$cod] = 1;
    }

    for ($i = 0; $i < 10; $i++) {
        if ($vecR[$i] && $vecW[$i] && $vecB[$i]) $c++;
    }

    return $c;
}

echo "Enter rods: ";
$input = trim(fgets(STDIN));
echo "Number of rods: " . searchColor($input) . "\n";
?>
