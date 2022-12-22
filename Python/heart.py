from turtle import *
import turtle

pen = turtle.Turtle()

def heart():
    pen.fillcolor("red")
    pen.begin_fill()
    pen.left(140)
    pen.forward(113)
    curve()
    pen.left(120)
    curve()
    pen.forward(112)
    pen.end_fill()

def curve():
    for i in range(200):
        pen.right(1)
        pen.forward(1)

def txt():
    pen.up()
    pen.setpos(-68, 95)
    pen.down()
    pen.color("lightpink")
    pen.write("I Love You", font=("Arial", 12, "normal"))

heart()
txt()
pen.ht()

