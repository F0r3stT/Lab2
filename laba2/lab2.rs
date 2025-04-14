use std::io;

fn search_color(r: &str) -> i32 {
    if r.len() % 2 != 0 {
        println!("Incorrect value");
        return 0;
    }

    let mut vec_r = [0; 10];
    let mut vec_w = [0; 10];
    let mut vec_b = [0; 10];
    let chars: Vec<char> = r.chars().collect();

    for i in (0..r.len()).step_by(2) {
        let color = chars[i];
        let cod = chars[i + 1].to_digit(10).unwrap() as usize;

        match color {
            'R' => vec_r[cod] = 1,
            'W' => vec_w[cod] = 1,
            'B' => vec_b[cod] = 1,
            _ => {}
        }
    }

    let mut c = 0;
    for i in 0..10 {
        if vec_r[i] == 1 && vec_w[i] == 1 && vec_b[i] == 1 {
            c += 1;
        }
    }
    c
}

fn main() {
    let mut input = String::new();
    println!("Enter rods: ");
    io::stdin().read_line(&mut input).unwrap();
    let input = input.trim();
    println!("Number of rods: {}", search_color(input));
}
