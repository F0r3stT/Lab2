import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function searchEven(num: number): number {
    let count = 0;
    while (num > 0) {
        let last = num % 10;
        if (last % 2 === 0) count++;
        num = Math.floor(num / 10);
    }
    return count;
}

rl.question("Enter number of numbers: ", nStr => {
    const n = parseInt(nStr);
    let count = 0;

    function loop() {
        if (count < n) {
            rl.question("Enter number: ", kStr => {
                const k = parseInt(kStr);
                console.log(searchEven(k));
                count++;
                loop();
            });
        } else {
            rl.close();
        }
    }

    loop();
});
