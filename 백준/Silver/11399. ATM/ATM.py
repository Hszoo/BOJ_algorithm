import sys

def atm_sol(list, length):
    list.sort()
    sum = 0
    for i in range(length):
        for j in range(i + 1):
            sum += list[j]
    return sum


n = int(sys.stdin.readline()) 
values = list(map(int, input().split())) 

print(atm_sol(values, n))
