
def countingValleys(n, s):
    lvl = 0
    v = 0

    for c in s:
        if c == 'U':
            lvl +=1
        if c == 'D':
            lvl -= 1
        if lvl == 0 and c == 'U':
            v += 1
    return v

if __name__ == '__main__':
    n = int(input())
    s = input()

    result = countingValleys(n, s)
    print(result)
