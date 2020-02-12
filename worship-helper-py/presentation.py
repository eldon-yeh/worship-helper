import file_utils
import parser_utils

class presentation():
    """"""
    def __init__(self):
        self.head = file_utils.read_file("head.html")
        self.tail = file_utils.read_file("tail.html")
        self.body = "<section>\n"

    def parse_file(self, fname):
        """
        reads in a file and converts to html
        appends to self.body
        """
        file = open(fname, "r")
        counter = 0
        for line in file:
            line = line.strip()
            if line == "":
                self.body += "</section>\n<section>\n"
            else:
                if counter == 0: # checking if it's the first slide
                    self.body += parser_utils.h(line) # heading
                else:
                    self.body += parser_utils.p(line) # regular text
            counter += 1
        file.close()

    def clear(self):
        # resets self.body
        self.body = ""

    def print(self):
        print(self.head + self.body + self.tail)

    def write(self):
        file = open("output.html", "w")
        file.write(self.head + self.body + self.tail)
        file.close()
