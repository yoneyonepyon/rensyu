def mysum(ary=[]):
    if len(ary) == 0:
        return 0
    
    elif len(ary) == 1:
        return ary[0]
    
    else:
        return ary[0] + mysum(ary[1:])

guess = range(9999)
print(len(guess))
print(sum(guess))
print(mysum(guess))
