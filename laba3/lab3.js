const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

function searchEven(num) {
    let count = 0;
    while (num > 0) {
        let last = num % 10;
        if (last % 2 === 0) count++;
        num = Math.floor(num / 10);
    }
    return count;
}

readline.question("Enter number of numbers: ", n => {
    let count = 0;
    let loop = () => {
        if (count < n) {
            readline.question("Enter number: ", num => {
                console.log(searchEven(parseInt(num)));
                count++;
                loop();
            });
        } else {
            readline.close();
        }
    };
    loop();
});
