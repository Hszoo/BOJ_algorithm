import sys 

# sys.setrecursionlimit(10**6)
# def memo_fibo(n, memo={}) : 
# 	if n == 0 or n == 1 : 
# 		return n
# 	if not memo.get(n) : 
# 		memo[n] = memo_fibo(n-2) + memo_fibo(n-1)
# 	return memo[n]



# n = int(sys.stdin.readline())
# count = [0 for i in range(n+2)] 
# print(memo_fibo(n, count) % 1000000007) 


def iter_fibo(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, (a + b) % 1000000007
    return a

n = int(sys.stdin.readline())
result = iter_fibo(n)
print(result)
