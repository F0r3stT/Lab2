import Foundation

func searchColor(_ r: String) -> Int {
    if r.count % 2 != 0 {
        print("Incorrect value")
        return 0
    }

    var vecR = Array(repeating: 0, count: 10)
    var vecW = Array(repeating: 0, count: 10)
    var vecB = Array(repeating: 0, count: 10)
    var c = 0
    let chars = Array(r)

    for i in stride(from: 0, to: chars.count, by: 2) {
        let color = chars[i]
        let cod = Int(String(chars[i + 1])) ?? 0

        switch color {
        case "R": vecR[cod] = 1
        case "W": vecW[cod] = 1
        case "B": vecB[cod] = 1
        default: break
        }
    }

    for i in 0..<10 {
        if vecR[i] == 1 && vecW[i] == 1 && vecB[i] == 1 {
            c += 1
        }
    }

    return c
}

print("Enter rods: ", terminator: "")
if let input = readLine() {
    print("Number of rods: \(searchColor(input))")
}
