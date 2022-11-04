n = input()

if len(n) != 7 or n.count('0') + n.count('1') != 7:
    print("Неверный ввод!")
    exit(0)


def xor2(a, b):
    return (a or b) and (not (a and b))


def xor(*args):
    ans = 0
    for i in args:
        ans = xor2(ans, i)
    return int(ans)


r1 = int(n[0])
r2 = int(n[1])
i1 = int(n[2])
r3 = int(n[3])
i2 = int(n[4])
i3 = int(n[5])
i4 = int(n[6])

s1 = xor(r1, i1, i2, i4)
s2 = xor(r2, i1, i2, i4)
s3 = xor(r3, i2, i3, i4)
if not (s1 or s2 or s3):
    print("Ошибок в сообщении нет")
    print(f"Итоговое сообщение выглядит так: {i1}{i2}{i3}{i4}")
else:
    num = s1 + s2 * 2 + s3 * 4
    if num == 3:
        i1 = xor(i1, 1)
    elif num == 5:
        i2 = xor(i2, 1)
    elif num == 6:
        i3 = xor(i3, 1)
    elif num == 7:
        i4 = xor(i4, 1)
    print(f"Ошибка в сообщении была в бите номер {num}")
    print(f"Итоговое сообщение выглядит так: {i1}{i2}{i3}{i4}")
