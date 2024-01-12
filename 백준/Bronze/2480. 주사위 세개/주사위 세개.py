import sys

nums = sys.stdin.readline().split()

max_count = -1
max_count_num = -1
max = -1
for n in nums :
    if(nums.count(n) > max_count) :
        max_count = nums.count(n)
        max_count_num = int(n)
    if int(n) >= max :
        max = int(n)

if max_count == 3 :
    price = 10000 + max_count_num * 1000
elif max_count == 2 : 
    price = 1000 + max_count_num * 100
else : 
    price = max * 100

print(price)
