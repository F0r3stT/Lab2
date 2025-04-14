print "Enter number: "
n = gets.to_i
print "Enter position: "
p = gets.to_i

if n < 0 || p < 0
  puts "Incorrect value"
  exit
end

c = 0
while n > 0
  digit = n % 10
  c += 1
  puts "well done: #{digit}" if c == p
  n /= 10
end