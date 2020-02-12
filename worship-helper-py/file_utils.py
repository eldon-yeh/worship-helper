def read_file(fname):
    contents = ""
    file = open(fname, "r")
    for line in file:
        contents += line
    file.close()
    return contents
