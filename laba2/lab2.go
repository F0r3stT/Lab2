package main

import (
	"fmt"
)

func SearchColor(r string) int {
	if len(r)%2 != 0 {
		fmt.Println("Incorrect value")
		return 0
	}

	c := 0
	VecR := make([]int, 10)
	VecW := make([]int, 10)
	VecB := make([]int, 10)

	for i := 0; i < len(r); i += 2 {
		color := r[i]
		cod := int(r[i+1] - '0')

		switch color {
		case 'R':
			VecR[cod] = 1
		case 'W':
			VecW[cod] = 1
		case 'B':
			VecB[cod] = 1
		}
	}

	for i := 0; i < 10; i++ {
		if VecR[i] == 1 && VecW[i] == 1 && VecB[i] == 1 {
			c++
		}
	}
	return c
}

func main() {
	var input string
	fmt.Print("Enter rods: ")
	fmt.Scanln(&input)
	fmt.Println("Number of rods:", SearchColor(input))
}
