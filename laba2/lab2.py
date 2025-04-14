def search_color(r):
    if len(r) % 2 != 0:
        print("Incorrect value")
        return 0

    vecR = [0] * 10
    vecW = [0] * 10
    vecB = [0] * 10
    c = 0

    for i in range(0, len(r), 2):
        color = r[i]
        cod = int(r[i+1])

        if color == 'R':
            vecR[cod] = 1
        elif color == 'W':
            vecW[cod] = 1
        elif color == 'B':
            vecB[cod] = 1

    for i in range(10):
        if vecR[i] and vecW[i] and vecB[i]:
            c += 1

    return c

a = input("Enter rods: ")
print("Number of rods:", search_color(a))
