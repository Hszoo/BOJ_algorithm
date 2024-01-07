import sys 

def memo_fibo(n, count={}) : 
	if n == 0: 
		count[n] = {0: 1, 1: 0}
		
	elif n == 1: 
		count[n] = {0: 0, 1: 1}

	if not count.get(n) : 
		count[n] = {0: memo_fibo(n - 2, count)[0] + memo_fibo(n - 1, count)[0],
                1: memo_fibo(n - 2, count)[1] + memo_fibo(n - 1, count)[1]}
	
	return count[n]


k = int(input())
	
while k > 0 :
	n = int(sys.stdin.readline())
	count = {}
	result = memo_fibo(n, count)
	print(result[0], result[1]) 
	k -= 1;