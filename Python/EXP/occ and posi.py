#write a program to find the occurence and position of the sub string within the string
import re
text = 'Formula 1 2022 Miami Grand Prix'
pattern = 'Miami'
for match in re.finditer(pattern, text):
    s = match.start()
    e = match.end()
    print('Found "%s" at %d:%d' % (text[s:e], s, e))