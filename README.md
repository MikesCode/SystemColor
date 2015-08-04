# SystemColor
SystemColor is a single class that allows easy use of ANSI. ANSI allows the use of color codes inside of your Java System.
There are currently 16 different colors available:
Black, Gray, Maroon (Dark-Red), Red, Green, Lime-Green, Gold/Dark-Yellow, Yellow, Blue, Royal Blue, Purple, Magenta, Cyan, Aquamarine, Silver, and the default; white.
You cannot connect a System Color value to anything other than a string, however; 'SystemColor.CYAN + ""' is a simple work-around!
Also, because of the way Systems/ANSI work, you must call SystemColor.RESET after using it (Other wise your entire system will be the color that you just called)
