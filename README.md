# WORSHIP-HELPER

Helper program for creating worship presentations for lyrics.

# HOW IT WORKS
Uses reveal.js as the platform to display our presentations.

Worship-helper reads in text files of song lyrics and
creates a html which is usable with reveal.js.

# REQUIREMENTS
- [reveal.js](https://github.com/hakimel/reveal.js/)
- [java](https://www.java.com/en/download/)

# INSTALLATION
Download the latest [release](https://github.com/eldon-yeh/worship-helper/releases/).
Extract the files into your reveal.js installation folder.

# USAGE
- For windows users
  - run worship-helper.bat
- For linux/mac
  - run the jar file through command line with java -jar
- Follow the prompts and enter your song names
  - make sure you enter the song names EXACTLY as the text file name
    - i.e. king_of_kings
- Then open the output.html in your browser (internet is not required)

Put your text files with song lyrics into the songs folder.
Be sure to use consistent naming conventions, as file input
names are case-sensitive.

## SONG LYRIC FILE STRUCTURE
Songs lyrics are saved in text files, some have been provided
already in the songs folder and you can easily create your own.

- __The first line in your text file should be the title of the song.__
- Leave __one__ blank line between paragraphs where you want a new slide
to start
  - __do not__ use more than one blank line in a row.

# CUSTOMISATION
The presentation can be customized by editing tail.html.

# TODO
- web scraping for lyrics.
- gui
