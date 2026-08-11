def eq(h1,h2,h3):
    s1=[]
    s2=[]
    s3=[]
    t = 0
    for x in reversed(h1):
        s1.append(x+t)
        t=x+t
    t=0
    for x in reversed(h2):
        s2.append(x+t)
        t=x+t
    t=0
    for x in reversed(h3):
        s3.append(x+t)
        t=x+t
    while s1 and s2 and s3:
        a = s1[-1]
        b = s2[-1]
        c = s3[-1]
        if a==b==c:
            return a
        if a>=b and a>=c:
            s1.pop()
        elif b>=a and b>=c:
            s2.pop()
        else:
            s3.pop()
    return 0
h1 = [3, 2, 1, 1, 1]
h2 = [4, 3, 2]
h3 = [1, 1, 4, 1]
print(eq(h1,h2,h3))