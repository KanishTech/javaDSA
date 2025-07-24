n = int(input())
if n<=1:
    print("Prime")
c = 2
while c*c<=n:
    if n%c==0:
        print("Not Prime")
        break
    c+=1
if c == 2:
    print("Prime")

