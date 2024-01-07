import sys 

def memo_fibo(n, memo={}) : 
	if n == 0 or n == 1 : 
		return n
	if not memo.get(n) : 
		memo[n] = memo_fibo(n-2) + memo_fibo(n-1)
	return memo[n]


if __name__ == '__main__' : 
	n = int(sys.stdin.readline())
	
	print(memo_fibo(n)) 