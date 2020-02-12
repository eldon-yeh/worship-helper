import file_utils
from presentation import presentation

if __name__== "__main__":
    p = presentation()
    p.parse_file("test.txt")
    p.print()
    p.write()