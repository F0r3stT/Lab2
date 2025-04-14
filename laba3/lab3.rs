use std::io;

fn search_even(mut num: i32) -> i32 {
    let mut count = 0;
    while num > 0 {
        let last = num % 10;
        if last % 2 == 0 {
            count += 1;
        }
        num /= 10;
    }
    count
}

fn main() {
    let mut input = String::new();
    println!("Enter number of numbers: ");
    io::stdin().read_line(&mut input).unwrap();
    let n: i32 = input.trim().parse().unwrap();
    
    for _ in 0..n {
        input.clear();
        println!("Enter number: ");
        io::stdin().read_line(&mut input).unwrap();
        let k: i32 = input.trim().parse().unwrap();
        println!("{}", search_even(k));
    }
}
    