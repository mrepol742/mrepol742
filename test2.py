import sys

s = input('Enter the string: ')
t = ''
for chr in s:
    if t == '' or chr != t[len(t)-1]:
        t=t+chr

sys.stdout.write(t + "\n")