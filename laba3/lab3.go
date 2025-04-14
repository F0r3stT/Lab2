package main

import (
    "fmt"
)

func SearchEven(num int) int {
    count := 0
    for num > 0 {
        last := num % 10
        if last%2 == 0 {
            count++
        }
        num /= 10
    }
    return count
}

func main() {
    var n int
    fmt.Print("Enter number of numbers: ")
    fmt.Scan(&n)
    for i := 0; i < n; i++ {
        var k int
        fmt.Print("Enter number: ")
        fmt.Scan(&k)
        fmt.Println(SearchEven(k))
    }
}
	