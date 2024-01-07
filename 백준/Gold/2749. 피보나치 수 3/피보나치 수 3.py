import sys

def iter_fibo(n, memo, period):
    if n < 2:
        return n

    memo[0] = 0
    memo[1] = 1
    i = 2
    while(i < 15 * 10 ** 5) :
        memo[i] = (memo[i-1] + memo[i-2]) % (10 ** 6)
        i += 1
    
    while(n >= i - 1) : 
        n %= period
    return memo[n]

n = int(sys.stdin.readline())
period = 15 * 10 ** 5
memo = [-1] * (period + 1)

result = iter_fibo(n, memo, period)

print(result)
