import sys

N, M = map(int, input().split())

nums = list(map(int, input().split()))

sums = [nums[0]]

for i in range(1, N) : 
    result = sums[i-1] + nums[i]
    sums.append(result)

answer = []
for _ in range(M) :
    n1, n2 = map(int, input().split())

    result = sums[n2 - 1] - sums[n1 - 1] + nums[n1 - 1]
    answer.append(result)

print('\n'.join(map(str, answer)))