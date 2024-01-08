import sys

def atm_sol(list, length):
    list.sort()
    min_time = 0
    for i in range(1, length + 1):
        min_time += sum(list[0:i])
    
    return min_time


n = int(sys.stdin.readline()) 
values = list(map(int, input().split())) 

print(atm_sol(values, n))
