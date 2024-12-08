n = int(input());

if n%2 == 1:
    if n%3 == 0:
        print("true");
    else:
        print("false");
elif n%2 == 0:
    if n%5 == 0:
        print("true");
    else:
        print("false");