package main

import (
	"fmt"
)

func main() {
	var N int
	var P int
	var digit int
	var c int = 0

	fmt.Print("Введите число: ")
	fmt.Scan(&N)
	fmt.Print("Введите позицию: ")
	fmt.Scan(&P)

	if N < 0 || P < 0 {
		fmt.Println("Вы ввели неверное значение")
		return
	}

	for i := N; i > 0; i /= 10 {
		digit = i % 10
		c++
		if c == P {
			fmt.Println("well done:", digit)
		}
	}
}
