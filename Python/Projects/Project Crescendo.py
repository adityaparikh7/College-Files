import pygame
from pygame import mixer
from tkinter import *
import os 
from tkinter import filedialog 
def playsong():
    currentsong=playlist.get(ACTIVE)
    print(currentsong)
    mixer.music.load(currentsong)
    songstatus.set("Playing")
    mixer.music.play()
def pausesong():
    songstatus.set("Paused")
    mixer.music.pause()
def stopsong():
    songstatus.set("Stopped")
    mixer.music.stop()
def resumesong():
    songstatus.set("Resuming")
    mixer.music.unpause()    
def nextsong():
    currentsong=playlist.get(ACTIVE)
    currentsong=playlist.curselection()
    currentsong=currentsong[0]
    currentsong=currentsong+1
    if currentsong>=len(playlist.get(0,END)):
        currentsong=0
    playlist.selection_clear(0,END)
    playlist.selection_set(currentsong)
    currentsong=playlist.get(currentsong)
    mixer.music.load(currentsong)
    mixer.music.play()
    songstatus.set("Playing")
def prevsong():
    currentsong=playlist.get(ACTIVE)
    currentsong=playlist.curselection()
    currentsong=currentsong[0]
    currentsong=currentsong-1
    if currentsong<0:
        currentsong=len(playlist.get(0,END))-1
    playlist.selection_clear(0,END)
    playlist.selection_set(currentsong)
    currentsong=playlist.get(currentsong)
    mixer.music.load(currentsong)
    mixer.music.play()
    songstatus.set("Playing")




root=Tk()
root.title('Project Crescendo')
root.iconbitmap("C:\\Users\\andro\\Downloads\\play (1).ico")
#root.geometry('500x300')
mixer.init()
songstatus=StringVar()
songstatus.set("choosing")
#playlist---------------
playlist=Listbox(root,selectmode=SINGLE,bg="black",fg="white",font=('arial',15),width=40)
playlist.grid(columnspan=5)
#enter file path to playlist below
os.chdir(r'C:\Users\andro\Music\Olivia Rodrigo - SOUR')

songs=os.listdir()

for s in songs:
    playlist.insert(END,s)


playbtn=Button(root,text="play",command=playsong)
playbtn.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
playbtn.grid(row=1,column=0)

pausebtn=Button(root,text="Pause",command=pausesong)
pausebtn.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
pausebtn.grid(row=1,column=1)

stopbtn=Button(root,text="Stop",command=stopsong)
stopbtn.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
stopbtn.grid(row=1,column=2)

Resumebtn=Button(root,text="Resume",command=resumesong)
Resumebtn.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
Resumebtn.grid(row=1,column=3)

nextbtn=Button(root,text="Next",command=nextsong)
nextbtn.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
nextbtn.grid(row=1,column=4)

prevsong=Button(root,text="Previous",command=prevsong)
prevsong.config(font=('arial',20),bg="Black",fg="white",padx=7,pady=7)
prevsong.grid(row=1,column=5)



#song status------------------
mainloop()