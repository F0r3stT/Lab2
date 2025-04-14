use std::io;

fn main() {
    let mut input = String::new();
    println!("Введите число: ");
    io::stdin().read_line(&mut input).unwrap();
    let n: i32 = input.trim().parse().unwrap();

    input.clear();
    println!("Введите позицию: ");
    io::stdin().read_line(&mut input).unwrap();
    let p: i32 = input.trim().parse().unwrap();

    if n < 0 || p < 0 {
        println!("Вы ввели неверное значение");
        return;
    }

    let mut i = n;
    let mut c = 0;
    while i > 0 {
        let digit = i % 10;
        c += 1;
        if c == p {
            println!("well done: {}", digit);
        }
        i /= 10;
    }
}
