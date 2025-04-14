import Foundation

func searchEven(_ num: Int) -> Int {
    var num = num
    var count = 0
    while num > 0 {
        let last = num % 10
        if last % 2 == 0 {
            count += 1
        }
        num /= 10
    }
    return count
}

print("Enter number of numbers: ", terminator: "")
if let nStr = readLine(), let n = Int(nStr) {
    for _ in 0..<n {
        print("Enter number: ", terminator: "")
        if let kStr = readLine(), let k = Int(kStr) {
            print(searchEven(k))
        }
    }
}
