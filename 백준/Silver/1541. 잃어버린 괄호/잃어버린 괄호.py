oper = input().split('-')
res = 0

store = []
for exp in oper:
    exp = list(map(int, exp.split('+')))
    store.append(sum(exp))

res = store[0] # 가장 첫번째 수는 항상 더해준다

for i in range(1,len(store)):
    res -= store[i]

print(res)