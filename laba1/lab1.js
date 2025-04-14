const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputs = [];

readline.question("Введите число: ", (n) => {
    inputs.push(parseInt(n));
    readline.question("Введите позицию: ", (p) => {
        inputs.push(parseInt(p));
        let [N, P] = inputs;
        if (N < 0 || P < 0) {
            console.log("Вы ввели неверное значение");
            readline.close();
            return;
        }

        let c = 0;
        while (N > 0) {
            let digit = N % 10;
            c++;
            if (c === P) {
                console.log("well done:", digit);
            }
            N = Math.floor(N / 10);
        }
        readline.close();
    });
});
