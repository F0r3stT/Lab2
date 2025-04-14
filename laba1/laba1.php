<?php
echo "Введите число: ";
$N = intval(trim(fgets(STDIN)));
echo "Введите позицию: ";
$P = intval(trim(fgets(STDIN)));

if ($N < 0 || $P < 0) {
    echo "Вы ввели неверное значение\n";
    exit;
}

$c = 0;
while ($N > 0) {
    $digit = $N % 10;
    $c++;
    if ($c == $P) {
        echo "well done: $digit\n";
    }
    $N = intdiv($N, 10);
}
?>
