function searchColor(r) {
    if (r.length % 2 !== 0) {
        console.log("Incorrect value");
        return 0;
    }

    let c = 0;
    const vecR = Array(10).fill(0);
    const vecW = Array(10).fill(0);
    const vecB = Array(10).fill(0);

    for (let i = 0; i < r.length; i += 2) {
        const color = r[i];
        const cod = parseInt(r[i + 1]);

        if (color === 'R') vecR[cod] = 1;
        else if (color === 'W') vecW[cod] = 1;
        else if (color === 'B') vecB[cod] = 1;
    }

    for (let i = 0; i < 10; i++) {
        if (vecR[i] && vecW[i] && vecB[i]) c++;
    }

    return c;
}

const input = prompt("Enter rods:");
console.log("Number of rods:", searchColor(input));
