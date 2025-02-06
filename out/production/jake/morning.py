a = input("Input lah: ")
def prime(a):
    while True:
        if a / 3 == 0:
            a = a/3
            print(3 + a)
        elif a / 2 == 0:
            a = a/2
            print(2 + a)
        elif a==3 or a==2:
            break
        else:
            print("skill issue")
print(a)
