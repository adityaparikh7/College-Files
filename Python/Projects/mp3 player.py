from tkinter import *
import pygame
from tkinter import filedialog

root = Tk()
root.title('Project Crescendo')
root.iconbitmap(r"C:\Users\andro\Downloads\play (1).ico")
root.geometry('500x300')

#to add songs to the playlist
def add_song():
    song = filedialog.askopenfilename(initialdir='C:/Users/andro/Music/', title='Choose a song', filetypes=(('mp3 files', '*.mp3'), ('all files', '*.*')))
    song = song.replace(r'C:/Users/andro/Music/', '')
    song = song.replace('.mp3', '')
    song_box.insert(END, song)

#to play the song
def play():
    song = song_box.get(ACTIVE)
    song = f'C/Users/andro/Music/{song}.mp3'

    pygame.mixer.music.load(song)
    pygame.mixer.music.play(loops=0)

#to stop current song
def stop():
    pygame.mixer.music.stop()
    song_box.selection_clear(ACTIVE) 

#playlist box
pygame.mixer.init()
song_box = Listbox(root, bg='black', fg='green', width=60, selectbackground='blue', selectforeground='white', font=('arial', 15))
song_box.pack(pady=20)

#icons and buttons
backbtn = PhotoImage(file=r'C:\\Users\\andro\\Downloads\\back.png')
forwardbtn = PhotoImage(file=r'C:\\Users\\andro\\Downloads\\forward.png')
playbtn = PhotoImage(file=r'C:\\Users\\andro\\Downloads\\play.png')
pausebtn = PhotoImage(file=r'C:\\Users\\andro\\Downloads\\pause.png')
stopbtn = PhotoImage(file=r'C:\\Users\\andro\\Downloads\\stop.png')

control_frame = Frame(root)
control_frame.pack()

back_button = Button(control_frame, image = backbtn, borderwidth=0, height=15, width=15)
forward_button = Button(control_frame, imag = forwardbtn, borderwidth=0, height=15, width=15)
play_button = Button(control_frame, image = playbtn, borderwidth=0, height=15, width=15, command=play)
pause_button = Button(control_frame, image = pausebtn, borderwidth=0, height=15, width=15)
stop_button = Button(control_frame, image = stopbtn, borderwidth=0, height=15, width=15, command=stop)

back_button.grid(row=0, column=0, padx=10)
forward_button.grid(row=0, column=1, padx=10)
play_button.grid(row=0, column=2, padx=10)
pause_button.grid(row=0, column=3, padx=10)
stop_button.grid(row=0, column=4, padx=10)

my_menu = Menu(root)
root.config(menu=my_menu)

add_song_menu = Menu(my_menu)
my_menu.add_cascade(label='Add Songs', menu=add_song_menu)
add_song_menu.add_command(label='Add Song to Playlst', command=add_song)


root.mainloop()