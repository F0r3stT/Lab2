def search_even(num):
    count = 0
    while num > 0:
        last = num % 10
        if last % 2 == 0:
            count += 1
        num //= 10
    return count

n = int(input("Enter number of numbers: "))
for i in range(n):
    k = int(input("Enter number: "))
    print(search_even(k))
