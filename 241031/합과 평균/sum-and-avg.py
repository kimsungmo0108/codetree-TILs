a, b = input().split();
a = int(a);
b = int(b);
hap = a + b;
r = hap/a;
r = round(r, 1);
print(f"{hap} {r}");