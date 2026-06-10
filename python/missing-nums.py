arr = [7,2,5,3,5,3]
brr = [7,2,5,4,6,3,5,3]
dici = {}
for i in brr:
    if i in dici:
        dici[i] +=1
    else:
        dici[i]=1
for i in arr:
    dici[i]-=1
    if dici[i] == 0:
        del dici[i]
ans = []
for i in dici:
    ans.append(i)
ans.sort()
print(ans)

