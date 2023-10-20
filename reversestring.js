function wordsReverser(string) {
    return string.split("").reverse().join("").split(" ").reverse().join(" ");
}
const userInput = prompt("Enter a string:");
const reversedString = wordsReverser(userInput);
console.log(reversedString);
