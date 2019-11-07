# create a loop to cycle through all numbers 1 to 100
1.upto(100) do |i|
   # write conditional statements to determine visibility and print the appropriate statement to the screen
      if i % 5 == 0 and i % 3 == 0
        puts "FizzBuzz"
      elsif i % 5 == 0
        puts "Buzz"
      elsif i % 3 == 0
        puts "Fizz"
      # if the number is not divisible by 3 or 5, simply print it to the screen
      else
        puts i
      end
    end
