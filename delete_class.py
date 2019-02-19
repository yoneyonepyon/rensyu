"""
    ワークスペースに含まれている.classファイルを
    すべて削除する
"""
from pathlib import WindowsPath
from os import remove

target = WindowsPath("D:\java-ii-12")

for file in target.glob("**/*.class"):
    print(file)
    remove(file)
