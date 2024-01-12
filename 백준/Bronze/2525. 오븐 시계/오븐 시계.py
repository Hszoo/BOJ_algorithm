import sys

times = sys.stdin.readline().split()
time = int(sys.stdin.readline())

hour = int(times[0])
minute = int(times[1]) + time

if minute >= 60 : 
    hour += int(minute / 60)
    minute %= 60

if hour >= 24 : 
    hour -= 24

print(hour, minute)
