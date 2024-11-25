a, b, c = input().split();
a = int(a);
b = int(b);
c = int(c);

m = a if a<b else b;
m = m if m<c else c;

if a == m:
    print("1 ", end="");
else:
    print("0 ", end="");

if a == b and b == c:
    print("1 ", end="");
else:
    print("0 ", end="");