import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputs: number[] = [];

rl.question("Enter number: ", (n) => {
    inputs.push(parseInt(n));
    rl.question("Enter position: ", (p)  => {
        inputs.push(parseInt(p));
        const [N, P] = inputs;
        if (N < 0 || P < 0) {
            console.log("Incorrect value");
            rl.close();
            return;
        }

        let temp = N;
        let c = 0;
        while (temp > 0) {
            const digit = temp % 10;
            c++;
            if (c === P) {
                console.log("well done:", digit);
            }
            temp = Math.floor(temp / 10);
        }
        rl.close();
    });
});
