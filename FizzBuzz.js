//create a loop to cycle through numbers from 1 to 100; initiate counting at 1; we want to include 100, so we count up to 101; iterate
for (var i=1; i < 101; i++){
  // write conditional statements to determine divisibility and print out the appropriate statement to the console.
    if (i % 3 == 0 && i % 5 == 0) console.log("FizzBuzz");
    else if (i % 3 == 0) console.log("Fizz");
    else if (i % 5 == 0) console.log("Buzz");
  // simply print to screen all the numbers that do not fit the conditions above
    else console.log(i);
}
 

