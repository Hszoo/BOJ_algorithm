import sys

x = int(sys.stdin.readline())
N = int(sys.stdin.readline())

total = 0
for _ in range(N) :
    temp = sys.stdin.readline().split()
    price = int(temp[0])
    n = int(temp[1])

    total += (price * n)

if x == total : 
    print("Yes")
else : 
    print("No")
