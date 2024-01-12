import sys

nums = sys.stdin.readline().split()

result = 0
for n in nums :
    result += int(n)

print(result)