def search_even(num)
    count = 0
    while num > 0
      last = num % 10
      count += 1 if last.even?
      num /= 10
    end
    count
  end
  
  print "Enter number of numbers: "
  n = gets.to_i
  
  n.times do
    print "Enter number: "
    k = gets.to_i
    puts search_even(k)
  end

#https://www.jdoodle.com/execute-ruby-online