a = int(input("enter number of lines: "))
for i in range(a):
	d = ""
	if a % 10 == 1:
		print("\n")
	else:
		for i in range(10):
			d+="*"
		print(d)
