def search_color(r)
    if r.length.odd?
      puts "Incorrect value"
      return 0
    end
  
    vecR = Array.new(10, 0)
    vecW = Array.new(10, 0)
    vecB = Array.new(10, 0)
    c = 0
  
    (0...r.length).step(2) do |i|
      color = r[i]
      cod = r[i + 1].to_i
  
      case color
      when 'R' then vecR[cod] = 1
      when 'W' then vecW[cod] = 1
      when 'B' then vecB[cod] = 1
      end
    end
  
    10.times { |i| c += 1 if vecR[i] == 1 && vecW[i] == 1 && vecB[i] == 1 }
  
    c
  end
  
  print "Enter rods: "
  a = gets.chomp
  puts "Number of rods: #{search_color(a)}"
  