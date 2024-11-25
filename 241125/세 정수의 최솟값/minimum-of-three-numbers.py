a, b, c = input().split();
a = int(a);
b = int(b);
c = int(c);

m = a if a<b else b;
m = m if m<c else c;

print(m);