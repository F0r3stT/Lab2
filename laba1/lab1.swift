import Foundation

print("Введите число: ", terminator: "")
let N = Int(readLine()!)!
print("Введите позицию: ", terminator: "")
let P = Int(readLine()!)!

if N < 0 || P < 0 {
    print("Вы ввели неверное значение")
} else {
    var n = N
    var c = 0
    while n > 0 {
        let digit = n % 10
        c += 1
        if c == P {
            print("well done: \(digit)")
        }
        n /= 10
    }
}
