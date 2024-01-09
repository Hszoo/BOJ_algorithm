N, K = map(int, input().split())

nums = [int(input()) for _ in range(N)]

nums.sort(reverse=True)  # 내림 차순 정렬

result = 0
for num in nums:
    result += K // num
    K %= num

print(result)
