<?php
function searchEven($num) {
    $count = 0;
    while ($num > 0) {
        $last = $num % 10;
        if ($last % 2 == 0) $count++;
        $num = intdiv($num, 10);
    }
    return $count;
}

echo "Enter number of numbers: ";
$n = intval(trim(fgets(STDIN)));

for ($i = 0; $i < $n; $i++) {
    echo "Enter number: ";
    $k = intval(trim(fgets(STDIN)));
    echo searchEven($k) . "\n";
}
?>
