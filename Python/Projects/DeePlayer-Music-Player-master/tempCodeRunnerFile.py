speaker = Button(win,image=speaker_img,bd=0,command=self.speaker_func)
        speaker.place(x=650,y=442)
        speaker.bind('<Enter>',on_enter_vol)
        speaker.bind('<Leave>',on_leave_vol)