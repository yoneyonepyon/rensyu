# https://ja.wikipedia.org/wiki/シーザー暗号


def cipher(sentence, key=3):
    m = ord('A')
    n = ord('Z')
    for c in sentence:
        d = ord(c)
        if m <= d and d <= n:
            c = chr(((d - key) - m) % 26 + m)
        print(c, end='')
    print()


if __name__ == "__main__":
    plain = 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'
    cipher(plain)  # QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
