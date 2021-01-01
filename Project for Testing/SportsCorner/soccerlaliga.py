#!J:/WinPython/WPy64-3740/python-3.7.4.amd64/python

'''
    The first line of the Python file indicates where Python is in the PC.
    If Python application file is in the folder J:/WinPython/WPy64-3740/python-3.7.4.amd64 , 
    the first line of Python script should be #!J:/WinPython/WPy64-3740/python-3.7.4.amd64/python
    
    As this web project uses both PHP and Python, and running of Python file is initiated from a PHP file, 
    this is important.
    
'''

from soccer_data_api import SoccerDataAPI
import os

soccer_data = SoccerDataAPI()


if os.path.exists("txt_laliga.txt"):
    os.remove("txt_laliga.txt")
f = open("txt_laliga.txt", "a")
laliga = soccer_data.la_liga()
for et in laliga:
    str1 = et['team']+","+ et['pos']+","+et['points']+","+et['matches_played']+","+et['wins']+","+et['losses']+","+et['goals_for']+","+et['goal_diff']+"\n"
    f.write(str1)
f.close()
