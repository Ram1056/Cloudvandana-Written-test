function sortArrayDescending() {
  const userInput = prompt('Enter numbers separated by commas: ');
  const numbersArr = userInput.split(',').map(Number);
  numbersArr.sort((a, b) => b - a);
  console.log('Sorted Array (Descending Order):', numbersArr);
}
sortArrayDescending();
