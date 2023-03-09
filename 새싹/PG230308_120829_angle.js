function solution(angle) {
    //var answer = 0;
    // if (angle > 0 && angle < 90) {
    //     answer = 1;
    // } else if (angle == 90) {
    //     answer = 2;
    // } else if (angle > 90 && angle < 180) {
    //     answer = 3;
    // } else {
    //     answer = 4;
    // }
    // return answer;

    return (angle > 0 && angle < 90) ? 1
        : (angle == 90) ? 2
        : (angle > 90 && angle < 180) ? 3
        : 4
}

const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});
rl.on("line", (line) => {
    console.log("출력: ", solution(line));
    rl.close();
});
rl.on('close', () => {
        process.exit();
})
