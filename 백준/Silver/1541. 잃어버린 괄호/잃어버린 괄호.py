expression = input().split('-')
min_sum = 0

temp = []
for exp in expression:
    exp = list(map(int, exp.split('+')))
    temp.append(sum(exp))

min_sum = temp[0] # 가장 첫번째 수는 항상 더해준다

for i in range(1,len(temp)):
    min_sum -= temp[i]

print(min_sum)