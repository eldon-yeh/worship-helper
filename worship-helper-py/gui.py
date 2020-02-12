from tkinter import *
from tkinter import messagebox
import os


def addsong():
    str = bank.get(bank.curselection())
    wallet.insert(END, str)

def clearwallet():
    wallet.delete(0, wallet.size())

def outputmessage():
    messagebox.showinfo(title="", message = "output created")

os.listdir()

root = Tk()

W = 800
H = 600

canvas = Canvas(root, height=H, width=W)
canvas.pack()

root.title("worship-helper")

frame_left = Frame(root, bg="red")
frame_middle = Frame(root, bg="white")
frame_right = Frame(root, bg="blue")

frame_left.place(relwidth=0.475, relheight=1)
frame_middle.place(relx = 0.475, relwidth=0.05, relheight=1)
frame_right.place(relx=0.525, relwidth=0.475, relheight=1)

bank = Listbox(frame_left)
bank_scroll = Scrollbar(frame_left, command = bank.yview)
bank.configure(yscrollcommand = bank_scroll.set)

wallet = Listbox(frame_right)
wallet_scroll = Scrollbar(frame_right, command = wallet.yview)
wallet.configure(yscrollcommand = wallet_scroll.set, selectmode =SINGLE)

bank.pack(side=LEFT, expand=TRUE, fill=BOTH)
bank_scroll.pack(side=RIGHT, fill=Y)
wallet.pack(side=LEFT, expand=TRUE, fill=BOTH)
wallet_scroll.pack(side=RIGHT, fill=Y)

add = Button(frame_middle, text="add", command=addsong)
clear = Button(frame_middle, text="clear", command=clearwallet)
create = Button(frame_middle, text="create", command=outputmessage)

add.pack(fill=Y)
clear.pack(fill=Y)
create.pack(fill=Y)

files = os.listdir("songs")

for i in files:
    bank.insert(END, i)
   
root.mainloop()
