inp = input()
arr = inp.split()
a_age = int(arr[0])
a_gen = arr[1]

inp = input()
arr = inp.split()
b_age = int(arr[0])
b_gen = arr[1]

if (a_age >= 19 and a_gen == 'M') or (b_age >= 19 and b_gen == 'M'):
	print("1")
else:
	print("0")