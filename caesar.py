# https://ja.wikipedia.org/wiki/シーザー暗号

CIPHER_LIST = [
    ('A', 'Z'),
    ('a', 'z'),
    ('0', '9'),
    ('ぁ', 'ん'),
    ('ァ', 'ヶ'),
    ('䀀', '龠'),
]


def cipher(sentense, index=0, key=3):
    # m = ord(CIPHER_LIST[index][0])
    # n = ord(CIPHER_LIST[index][1])

    l = [(ord(a), ord(z)) for a, z in CIPHER_LIST]

    for c in sentense:
        for m, n in l:
            if ord(c) in range(m, n):
                d = ord(c)
                if m <= d and d <= n:
                    c = chr(((d - key) - m) % (n - m) + m)
        print(c, end='')
    print()


if __name__ == "__main__":
    plain = 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'
    cipher(plain)  # QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
    plain = 'roses are red, violets are blue, sugar is sweet, and so are you.'
    cipher(plain)  # olpbp wob oba, sflibqp wob xirb, prdwo fp ptbbq, wka pl wob vlr.
    plain = 'いろはにほへとちりぬるを'
    cipher(plain)  # ぁりぬとへふづぞょどよわ
    plain = 'ニイタカヤマノボレ'
    cipher(plain)  # トァゼエメホニベラ
    plain = '19890108'
    cipher(plain)  # 79596765
    plain = '国破山河在城春草木深'
    cipher(plain)  # 固砱屮沰圥埋昢荆朥淮
