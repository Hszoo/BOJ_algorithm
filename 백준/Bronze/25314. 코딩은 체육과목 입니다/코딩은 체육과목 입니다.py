import sys

n = int(sys.stdin.readline())

result = ""
for _ in range(int(n / 4)) :
    result += "long "
print(result + "int")