h, w = map(int, input().split())

bmi = (10000 * w) / (h * h)

bmi_int = int(bmi)
print(bmi_int)

if bmi_int >= 25:
    print("Obesity")