left_eye = float(input())
right_eye = float(input())

if left_eye >= 1.0 and right_eye >= 1.0:
    print("High")
elif left_eye >= 0.5 and right_eye >= 0.5:
    print("Middle")
else:
    print("Low")
